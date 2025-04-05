#include <iostream>
#include <array>

using namespace std;

int main()
{
    int numero = 0;
    // Arreglo, es un conjunto de elementos almacenados en memoria de forma conjunta
    // Arreglo con inicializacion
    int numeros[5] = {10, 20, 30, 40, 50};

    // Arreglos sin inicializacion
    int numeros2[3];

    // Accesos al arreglo: mediante indices
    // Indice: posicion de un elemento dentro de un arreglo
    //         numero que va del 0 en adelante, segun el tamano del arreglo
    /// int numeros[5] = {10, 20, 30, 40, 50};
    //                   0    1  2   3   4  .....

    cout << "numeros[0] = " << numeros[0] << endl;
    cout << "numeros[3] = " << numeros[3] << endl;

    // {10, 20, 30, 40, 50};

    numeros[0] = 99; // escritura
    // {99, 20, 30, 40, 50};
    cout << "numeros[0] = " << numeros[0] << endl;

    // tamano del arreglo
    int tamano = sizeof(numeros) / sizeof(numeros[0]);
    cout << "tamano del arreglo = " << tamano << endl;

    // Utilidad del tamano: impresion FOR
    cout << "Impresion de los elementos del arreglo: " << endl;
    for (int i = 0; i < tamano; i++) // 0 -> 5 : 0,1,2,3,4
    {
        cout << "numeros[" << i << "] => " << numeros[i] << endl;
    }

    cout << "Manipulacion del arreglo en proceso" << endl;
    for (int i = 0; i < tamano; i++)
    {
        numeros[i] = numeros[i] * numeros[i];
        // if
        // for, while
    }

    for (int i = 0; i < tamano; i++) // 0 -> 5 : 0,1,2,3,4
    {
        cout << "numeros[" << i << "] => " << numeros[i] << endl;
    }

    cout << endl
         << "ARREGLOS CON LIBRARIA array" << endl;
    // Libreria array
    // arreglo declarado mediante la libreria
    array<int, 4> arreglo = {7, 5, 6, 10};
    array<float, 2> arr_float = {2.5, 3.5};

    // impresion
    cout << "arreglo[0]    = " << arreglo[0] << endl;
    cout << "arreglo.at(0) = " << arreglo.at(0) << endl;

    arreglo[0] = 99;
    cout << "arreglo[0]    = " << arreglo[0] << endl;
    cout << "arreglo.at(0) = " << arreglo.at(0) << endl;

    // tamano: utilizar funcion size()
    int tamanoArreglo = arreglo.size();
    cout << "tamano del arreglo = " << tamanoArreglo << endl;

    cout << "arregloFloat[0]    = " << arr_float[0] << endl;
    cout << "arregloFloat.at(0) = " << arr_float.at(0) << endl;
    cout << "arregloFloat size  = " << arr_float.size() << endl;

    // sfor (int i = 0; i < tamanoArreglo; i++)
    for (int i = 0; i < arreglo.size(); i++)
    {
        cout << "arreglo[" << i << "] = " << arreglo[i] << endl;
    }
    // Forma corta de impresion
    for (int numeroArregloFor : arreglo)
    {
        cout << "arreglo = " << numeroArregloFor << endl;
    }

    cout << endl;
    cout << "***************************" << endl;
    cout << "Matrices" << endl;
    // Matriz: arreglo multidimensional

    // array<int, 3> arreglo = {7, 5, 10};
    array<array<int, 3>, 3> matriz = {{
        //   0  1  2
        {1, 2, 3}, // 0
        {4, 5, 6}, // 1
        {7, 8, 9}, // 2
    }};

    // matriz: primer indice = fila
    // matriz: segundo indice = columna

    // Lectura
    cout << "mat[0][0] = " << matriz[0][0] << endl;
    cout << "mat[1][2] = " << matriz[1][2] << endl;

    // Escritura
    matriz[0][0] = 66;
    cout << "Actualizando matriz en posicion [0][0]" << endl;
    cout << "mat[0][0] = " << matriz[0][0] << endl;

    cout << "Impresion de matriz:" << endl;
    for (int i = 0; i < 3; i++) // fila: 0 -> 2
    {
        for (int j = 0; j < 3; j++) // columna: 0 -> 2
        {
            cout << matriz[i][j] << ", ";
        }
        cout << endl;
    }

    array<array<int, 2>, 4> matriz_2 = {{
        //0  1
        {1, 2},   // 0
        {4, 5},   // 1
        {7, 8},   // 2
        {10, 11}, // 3
    }};

    cout << "matriz.size()    = " << matriz_2.size() << endl;
    cout << "matriz[0].size() = " << matriz_2[0].size() << endl;

    cout << "Impresion de matriz usando size" << endl;
    for (int i = 0; i < matriz_2.size(); i++) 
    {
        for (int j = 0; j < matriz_2[0].size(); j++)
        {
            cout << matriz_2[i][j] << ", ";
        }
        cout << endl;
    }

    cout << endl;
    array<array<int,2>,2> arr;
    return 0;
}