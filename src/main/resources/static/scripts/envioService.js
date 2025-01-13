import axios from "axios";
const API_URL = "//localhost:8080";

class envioService {
    enviarMensagem(conteudo) {
        return axios.post(API_URL + "/api/mensagem", conteudo);
    }
}

export default new envioService;