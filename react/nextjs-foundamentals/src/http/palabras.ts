export const definicionDePalabraPerro = async () => {
  const resultado = await fetch(
    "https://www.wordsapi.com/mashape/words/dog/definitions?when=2024-11-10T22:43:55.192Z&encrypted=8cfdb18ee723929beb9107bded58babaaeb5280931f695b8",
    {
      method: "GET", // GET, PUT, POST, DELETE
    }
  );

  const datos = await resultado.json();
  console.log("datos: ", datos);
};
