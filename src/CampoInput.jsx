import { func } from "prop-types";
import { useState } from "react";
import envioService from "./main/resources/static/scripts/envioService.js";

function CampoInput() {
  const [texto, setMensagem] = useState("");

  const funcEnvioMensagem = (e) => {
    e.preventDefault();
    console.log("Deu certo", texto);
    envioService
      .enviarMensagem({ conteudo: texto })
      .then((res) => {
        console.log("Mensagem Enviada");
        setMensagem("");
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <div className="campo">
      <input
        field="texto"
        id="txttexto"
        type="text"
        placeholder="Digite sua mensagem"
        value={texto}
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
