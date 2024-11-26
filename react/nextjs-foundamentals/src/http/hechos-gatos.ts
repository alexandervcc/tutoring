export type HechoGato = {
  createdAt: string;
  text: string;
  _id: string;
};

export const hechosDeLosGatos = async (): Promise<HechoGato[]> => {
  const resultado = await fetch("https://cat-fact.herokuapp.com/facts/", {
    method: "GET", // GET, PUT, POST, DELETE
  });

  const datos = await resultado.json();

  return datos;
};
