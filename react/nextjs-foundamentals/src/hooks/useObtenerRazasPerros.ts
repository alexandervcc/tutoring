import { obtenerRazasDePerros, RazasPerros } from "@/http/razas-perros";
import { useEffect, useState } from "react";

const useObtenerRazasPerros = () => {
  const [razasDePerros, setRazasDePerros] = useState<RazasPerros>();
  const [cargando, setCargando] = useState<boolean>(false);

  useEffect(() => {
    setCargando(true)
    obtenerRazasDePerros()
      .then((res) => {
        setRazasDePerros(res);
        setCargando(false)
      })
      .catch((e) => {
        alert("No se pudo obtener las razas de perros.");
        setCargando(false)
      });
  }, []);

  return {
    razasDePerros,
    cargando
  };
};

export default useObtenerRazasPerros;
