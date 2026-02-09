public class ErroConsultaApiException extends RuntimeException{
    private String mensagem;

    public ErroConsultaApiException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
