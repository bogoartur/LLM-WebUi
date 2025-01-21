import axios from "axios";
const API_URL = "//localhost:8080";

class envioService {
    enviarMensagem(conteudo, remetente) {
        return axios.post(API_URL + "/api/mensagem", conteudo, remetente = true);
    }
}

export default new envioService;