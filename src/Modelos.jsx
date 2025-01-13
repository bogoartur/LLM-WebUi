import logoLLaVA from "./main/resources/static/icons/llava.png";
import logoMS from "./main/resources/static/icons/ms.jpeg";
import logoLlama from "./main/resources/static/icons/llama.webp";
import ModeloId from "./ModeloId.jsx";

function Modelos() {
  const modelos = [
    { nome: "LLaVA", logo: logoLLaVA },
    { nome: "Llama", logo: logoLlama },
    { nome: "Phi 4", logo: logoMS },
  ];

  return (
    <>
      {modelos.map((modelo) => (
        <ModeloId key={modelo.nome} nome={modelo.nome} logo={modelo.logo} />
      ))}
      ;
    </>
  );
}

export default Modelos;
