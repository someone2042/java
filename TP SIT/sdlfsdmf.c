#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
typedef struct
{
    int *array;
    int taille;
} Tableau;
int c1 = 0;
int c2 = 0;
int S = 0;
// fonction qui compte la premiere moitie des nbrs>=10
void fct1(void *arg)
{
    Tableau tab = (Tableau)arg;
    for (int i = 0; i < (tab->taille) / 2; i++)
    {
        if (tab->array[i] >= 10)
            c1++;
    }
}
// fonction qui compte la deuxieme moitie des nbrs>=10
void fct2(void *arg)
{
    Tableau tab = (Tableau)arg;
    for (int i = (tab->taille) / 2; i < tab->taille; i++)
    {
        if (tab->array[i] >= 10)
            c2++;
    }
}

int main()
{
    Tableau A;
    printf("entrer la taille du tableau:");
    scanf("%d", &(A.taille));
    A.array = malloc(sizeof(int) * A.taille);
    for (int i = 0; i < A.taille; i++)
    {
        printf("entrer l element%d=", (i + 1));
        scanf("%d", &(A.array[i]));
    }
    pthread_t th, th1;
    pthread_create(&th, NULL, fct1, &A);
    pthread_create(&th1, NULL, fct2, &A);
    pthread_join(th, NULL);
    pthread_join(th1, NULL);
    S = c1 + c2;
    printf(" le nombre d'entiers supérieur ou égale a 10 est:%d\n", S);
    return 0;
}