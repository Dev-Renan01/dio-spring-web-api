package dio.spring_web_api.handler;

// Criação de uma exceção personalizada
// Ela estende RuntimeException, então não precisa ser tratada obrigatoriamente com try/catch
public class BussinessException extends RuntimeException{

    public BussinessException(String mensagem){ // Construtor que recebe apenas uma mensagem simples
        super(mensagem);// Chama o construtor da classe RuntimeException
                        //e define a mensagem do erro

    }
    // Construtor que recebe uma mensagem com parâmetros variáveis
    // Object... params permite passar vários valores
    public BussinessException(String mensagem, Object ... params){
        super(String .format(mensagem, params));
    }
}
