export type RazasPerros = {
  status: string;
  message: Record<string, string[]>;
};

export const obtenerRazasDePerros = async (): Promise<RazasPerros> => {
  const resultado = await fetch("https://dog.ceo/api/breeds/list/all", {
    method: "GET", // GET, PUT, POST, DELETE
  });

  const datos = await resultado.json();

  return datos;
};
