package org.example.insecure.v2;

public class XSSVulnerableWebApp {

    public static void main(String[] args) {
        // Simulação de parâmetros de solicitação
        String mensagem = "<script>alert('XSS!');</script>";

        // Escreve a resposta HTML
        System.out.println("<html>");
        System.out.println("<head><title>XSS Vulnerável</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Mensagem:</h1>");
        System.out.println("<p>" + mensagem + "</p>"); // Potencialmente vulnerável a XSS
        System.out.println("</body>");
        System.out.println("</html>");
    }
}

