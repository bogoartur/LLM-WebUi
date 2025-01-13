import { func } from "prop-types";
import { useState } from "react";

function CampoInput() {
  const [mensagem, setMensagem] = useState("");

  const funcEnvioMensagem = () => {
    console.log("Deu certo", mensagem);
    setMensagem("");
  };

  return (
    <div className="campo">
      <input
        field="texto"
        id="txttexto"
        type="text"
        placeholder="Digite sua mensagem"
        value={mensagem}
        onChange={(e) => setMensagem(e.target.value)}
        onKeyDown={(e) => {
          if (e.key === "Enter") {
            funcEnvioMensagem(e);
          }
        }}
        required
      />
      <button
        className="enviar"
        type="button"
        onClick={(e) => funcEnvioMensagem(e)}
      >
        <i className="bi bi-send"></i>
      </button>
    </div>
  );
}

export default CampoInput;
