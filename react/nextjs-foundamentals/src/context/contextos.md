# Contextos
- Permite crear un estado global para la aplicacion
- Todos los componentes independiente de su posicion en el arbol (Virtual DOM) pueden acceder para leer/editar dicho estado
- Casos de uso comunes:
    - autenticacion
    - temas
    - idioma
    - configuracion global
    - carrito de compra

- Ventajas
    - Evita `prop drilling`, pasar props manualmente a traves de multiples niveles
    - Centralizacion

- Limitaciones
    - Re-renders innecesarios
      - Solucion: dividir el contexto o `useMemo` (cache)
    - Complejidad: En funcion del tamano de la aplicacion
    - Escalabilidad: Para estados mucho mas complejos hay otras herramientas como: `redux`, `mobx`, `zustand`