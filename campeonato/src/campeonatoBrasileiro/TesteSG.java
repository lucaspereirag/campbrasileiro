package campeonatoBrasileiro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TesteSG {

	public static void main(String[] args) {
		// PONTUAÇÃO TOTAL
		int sepPontos = 80; // PALMEIRAS PONTOS
		int spfcPontos = 80; // SÃO PAULO PONTOS
		int sccpPontos = 80; // CORINTHIANS PONTOS

		// SALDO DE GOLS
		int sepSG = 37; // PALMEIRAS GOLS
		int spfcSG = 20; // SÃO PAULO GOLS
		int sccpSG = 28; // CORINTHIANS GOLS

		// CAMPEÃO - MAIOR PONTUADOR DO CAMPEONATO
		// E SE MAIORES PONTUADORES, 80 E 80, QUEM TEM O MAIOR SALDO DE GOLS
		// E (&&) - 2 AFIRMATIVAS 
		// SEP - 80 PONTOS && MAIOR GOLEADOR? SPFC 28 E SEP 17
		// SEP NAO SENDO CAMPEAO
		
		
		
		List<Integer> pontuacao = new ArrayList<>();
		pontuacao.add(sepPontos); // 80
		pontuacao.add(spfcPontos); // 76 
		pontuacao.add(sccpPontos); // 80

		int maiorPontuador = Collections.max(pontuacao); //80

		List<Integer> saldoGols = new ArrayList<>(); //LISTA VAZIA NO MOMENTO

		if (sepPontos >= maiorPontuador) { // SEP = 80 = 80
			saldoGols.add(sepSG);// ADD O SALDO DE GOLS DO PALMEIRAS DOS CONCORRENTES AO CAMPEAO
		}
		if (spfcPontos >= maiorPontuador) { // SPFC = 76 - 80
			saldoGols.add(spfcSG); // FALSO - 28 GOLS NAO VAO +
		}
		if (sccpPontos >= maiorPontuador) { // VERDADEIRO
			saldoGols.add(sccpSG);
		}

		int maiorGoleador = Collections.max(saldoGols); // MAIOR GOLEADOR - 
		
		String campeao;

		if (sepPontos == maiorPontuador && sepSG == maiorGoleador) {
			System.out.println("Deu Palmeiras");
			campeao = "Palmeiras";
		} else if (spfcPontos == maiorPontuador && spfcSG == maiorGoleador) {
			System.out.println("Deu SPFC");
			campeao = "Sao Paulo";
		} else if (sccpPontos == maiorPontuador && sccpSG == maiorGoleador) {
			System.out.println("Deu Corinthians");
			campeao = "Corinthians";
		} else {
			System.out.println("Deu Pau de novo...");
		}

	}
}



