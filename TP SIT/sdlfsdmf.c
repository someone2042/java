#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
int S; // le resultat
int r1 = 0;
int r2 = 0;
int factoriel(int n)
{ // fonction pour calculer le factoriel
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factoriel(n - 1);
}
void fonction1(void *arg)
{
    int j = *(int *)arg;
    r1 = factoriel(j);
    pthread_exit(0);
}
void fonction2(void *arg)
{
    int j = *(int *)arg;
    r2 = factoriel(j);
    pthread_exit(0);
}

int main()
{
    pthread_t th, ph;
    int n = 3;
    int p = 5;
    // creation des threads
    pthread_create(&th, NULL, fonction1, &n);
    pthread_create(&ph, NULL, fonction2, &p);
    // attendre que les threads finissent leur execution
    pthread_join(th, NULL);
    pthread_join(ph, NULL);
    S = r1 + r2; // recuperation du resultat
    printf(" la somme des deux factoriels est:%d\n", S);
    return 0;
}