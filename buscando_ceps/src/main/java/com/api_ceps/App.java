package com.api_ceps;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Scanner;





public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);


        MySQLConnection conexao= new MySQLConnection();

        System.out.println(conexao);

    	System.out.print("Qual é o cep que deseja pesquisar? ");
    	String cep = scanner.nextLine();


        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://brasilapi.com.br/api/cep/v1/"+cep))
                .headers("Accept", "application/json")

                .timeout(Duration.ofSeconds(3))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(3))
                .followRedirects(Redirect.NORMAL)
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

        if(response.statusCode()==200){
            conexao.salvarResultado(response.body());
        }
        else{
            System.out.println("Houve uma falha ao fazer a busca por esse cep, tente novamente com outro");
        }



    }

}
