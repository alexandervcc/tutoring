import type { Metadata } from "next";
import "./globals.css";
import TemaContextoProovedor from "@/context/TemaContextoProovedor";

export const metadata: Metadata = {
  title: "Pagina de Inicio",
};

const RootLayout = ({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) => {
  return (
    <html lang="en">
      <TemaContextoProovedor>
        <body>{children}</body>
      </TemaContextoProovedor>
    </html>
  );
};

export default RootLayout;
