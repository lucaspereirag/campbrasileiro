package campeonatoBrasileiro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Partidas {

	private static final char[] Tabela = null;

	public static <T> void main(String[] args) {

		Random ran = new Random();

		List<String> times = new ArrayList<>();

		List<Integer> listaParana = new ArrayList<>();
		int resultParana = 0; // Gols
		int pontosParana = 0; // Pontos
		int totaljogosParana = 0; // Qts vezes jogou
		int resultParanaGC = 0; // Gols Contra - sofreu
		int resultParanaSG = 0; // Saldo

		List<Integer> listaGoieniense = new ArrayList<>();
		int resultGoieniense = 0;
		int pontosGoieniense = 0;
		int totaljogosGoieniense = 0;
		int resultGoienienseGC = 0;
		int resultGoienienseSG = 0;

		List<Integer> listaMineiro = new ArrayList<>();
		int resultMineiro = 0;
		int pontosMineiro = 0;
		int totaljogosMineiro = 0;
		int resultMineiroGC = 0;
		int resultMineiroSG = 0;

		List<Integer> listBahia = new ArrayList<>();
		int resultBahia = 0;
		int pontosBahia = 0;
		int totaljogosBahia = 0;
		int resultBahiaGC = 0;
		int resultBahiaSG = 0;

		List<Integer> listaBotafogo = new ArrayList<>();
		int resultBotafogo = 0;
		int pontosBotafogo = 0;
		int totaljogosBotafogo = 0;
		int resultBotafogoGC = 0;
		int resultBotafogoSG = 0;

		List<Integer> listaCeara = new ArrayList<>();
		int resultCeara = 0;
		int pontosCeara = 0;
		int totaljogosCeara = 0;
		int resultCearaGC = 0;
		int resultCearaSG = 0;

		List<Integer> listaCorinthians = new ArrayList<>();
		int resultCorinthians = 0; 
		int pontosCorinthians = 0; 
		int totaljogosCorinthians = 0;
		int resultCorinthiansGC = 0; 
		int resultCorinthiansSG = 0; 

		List<Integer> listaCoritiba = new ArrayList<>();
		int resultCoritiba = 0;
		int pontosCoritiba = 0;
		int totaljogosCoritiba = 0;
		int resultCoritibaGC = 0;
		int resultCoritibaSG = 0;

		List<Integer> listaFlamengo = new ArrayList<>();
		int resultFlamengo = 0;
		int pontosFlamengo = 0;
		int totaljogosFlamengo = 0;
		int resultFlamengoGC = 0;
		int resultFlamengoSG = 0;

		List<Integer> listaFluminense = new ArrayList<>();
		int resultFluminense = 0;
		int pontosFluminense = 0;
		int totaljogosFluminense = 0;
		int resultFluminenseGC = 0;
		int resultFluminenseSG = 0;

		List<Integer> listaFortaleza = new ArrayList<>();
		int resultFortaleza = 0;
		int pontosFortaleza = 0;
		int totaljogosFortaleza = 0;
		int resultFortalezaGC = 0;
		int resultFortalezaSG = 0;

		List<Integer> listaGoias = new ArrayList<>();
		int resultGoias = 0;
		int pontosGoias = 0;
		int totaljogosGoias = 0;
		int resultGoiasGC = 0;
		int resultGoiasSG = 0;

		List<Integer> listaGremio = new ArrayList<>();
		int resultGremio = 0;
		int pontosGremio = 0;
		int totaljogosGremio = 0;
		int resultGremioGC = 0;
		int resultGremioSG = 0;

		List<Integer> listaInternacional = new ArrayList<>();
		int resultInternacional = 0;
		int pontosInternacional = 0;
		int totaljogosInternacional = 0;
		int resultInternacionalGC = 0;
		int resultInternacionalSG = 0;

		List<Integer> listaPalmeiras = new ArrayList<>();
		int resultPalmeiras = 0;
		int pontosPalmeiras = 0;
		int totaljogosPalmeiras = 0;
		int resultPalmeirasGC = 0;
		int resultPalmeirasSG = 0;

		List<Integer> listaRedbull = new ArrayList<>();
		int resultRedbull = 0;
		int pontosRedbull = 0;
		int totaljogosRedbull = 0;
		int resultRedbullGC = 0;
		int resultRedbullSG = 0;

		List<Integer> listaSantos = new ArrayList<>();
		int resultSantos = 0;
		int pontosSantos = 0;
		int totaljogosSantos = 0;
		int resultSantosGC = 0;
		int resultSantosSG = 0;

		List<Integer> listaSaopaulo = new ArrayList<>();
		int resultSaopaulo = 0;
		int pontosSaopaulo = 0;
		int totaljogosSaopaulo = 0;
		int resultSaopauloGC = 0;
		int resultSaopauloSG = 0;

		List<Integer> listaSport = new ArrayList<>();
		int resultSport = 0;
		int pontosSport = 0;
		int totaljogosSport = 0;
		int resultSportGC = 0;
		int resultSportSG = 0;

		List<Integer> listaVasco = new ArrayList<>();
		int resultVasco = 0;
		int pontosVasco = 0;
		int totaljogosVasco = 0;
		int resultVascoGC = 0;
		int resultVascoSG = 0;

		// ARRAY UNIDIMENSIONAL C/ PRIMITIVO
		String[] meuTimes = {"Athletico Paranaense", "Atlético Goianiense", "Atlético Mineiro",
				"Bahia", "Botafogo",
				"Ceara", "Corinthians", "Coritiba", 
				"Flamengo", "Fluminense", "Fortaleza",
				"Goias", "Grêmio",
				"Internacional", 
				"Palmeiras", 
				"Red Bull Bragantino", 
				"Santos", "São Paulo", "Sport", 
				"Vasco da Gama" };

		String campeonatoBr = "Iniciando o Campeonato, por favor, aguarde.\n";

		/*
		 * LAÇOS FOR QUE DEFINIRÃO AS PARTIDAS ASSIM COMO OS RESULTADOS ALEATÓRIOS (<5)
		 * E QUE SERÃO GERADOS PARA OS TIMES EM RESPECTIVA ORDEM.
		 */
		System.out.println(campeonatoBr);
		for (String i : meuTimes) { 
			for (String j : meuTimes) {
				if (i != j) {
					int result1 = ran.nextInt(5);
					if (result1 == 4) {
						result1 = 4;
					} else if (result1 == 3) {
						result1 = 3;
					} else if (result1 == 2) {
						result1 = 2;
					} else if (result1 == 1) {
						result1 = 1;
					} else {
						result1 = 0;
					}
					int result2 = ran.nextInt(5);
					if (result2 == 4) {
						result2 = 4;
					} else if (result2 == 3) {
						result2 = 3;
					} else if (result2 == 2) {
						result2 = 2;
					} else if (result2 == 1) {
						result2 = 1;
					} else {
						result2 = 0;
					}

					// PRINTA TODOS OS JOGOS DOS TIMES E RESULTADOS
					System.out.println((i) + " (" + result1 + ")" + " x " + "(" + result2 + ") " + (j));

					if (i.equals("Athletico Paranaense")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultParana = result1 + resultParana;
										
						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultParanaGC = result2 + resultParanaGC;
						
						
						// SALDO DE GOLS EM CASA:
						resultParanaSG = resultParana - resultParanaGC;
					
						
						// CALCULA OS PONTOS DO TIME EM CASA
						if (result1 > result2) {
							pontosParana = 3 + pontosParana;
						} else if (result1 == result2) {
							pontosParana = 1 + pontosParana;
						} else {
							pontosParana = 0 + pontosParana;
						}

						totaljogosParana = 1 + totaljogosParana;
					}

					if (j.equals("Athletico Paranaense")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultParana = result2 + resultParana;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultParanaGC = resultParanaGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultParanaSG = resultParana - resultParanaGC;

						// CALCULA OS PONTOS DO TIME FORA DE CASA
						if (result2 > result1) {
							pontosParana = 3 + pontosParana;
						} else if (result2 == result1) {
							pontosParana = 1 + pontosParana;
						} else {
							pontosParana = 0 + pontosParana;
						}

						totaljogosParana = 1 + totaljogosParana;
					}

					if (i.equals("Atlético Goianiense")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultGoieniense = result1 + resultGoieniense;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultGoienienseGC = result2 + resultGoienienseGC;

						// SALDO DE GOLS EM CASA:
						resultGoienienseSG = resultGoieniense - resultGoienienseGC;

						if (result1 > result2) {
							pontosGoieniense = 3 + pontosGoieniense;
						} else if (result1 == result2) {
							pontosGoieniense = 1 + pontosGoieniense;
						} else {
							pontosGoieniense = 0 + pontosGoieniense;
						}

						totaljogosGoieniense = 1 + totaljogosGoieniense;
					}

					if (j.equals("Atlético Goianiense")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultGoieniense = result2 + resultGoieniense;
		

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultGoienienseGC = resultGoienienseGC + result1;
		

						// SALDO DE GOLS FORA DE CASA:
						resultGoienienseSG = resultGoieniense - resultGoienienseGC;

						if (result2 > result1) {
							pontosGoieniense = 3 + pontosGoieniense;
						} else if (result2 == result1) {
							pontosGoieniense = 1 + pontosGoieniense;
						} else {
							pontosGoieniense = 0 + pontosGoieniense;
						}

						totaljogosGoieniense = 1 + totaljogosGoieniense;
					}

					if (i.equals("Atlético Mineiro")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultMineiro = result1 + resultMineiro;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultMineiroGC = result2 + resultMineiroGC;

						// SALDO DE GOLS EM CASA:
						resultMineiroSG = resultMineiro - resultMineiroGC;

						if (result1 > result2) {
							pontosMineiro = 3 + pontosMineiro;
						} else if (result1 == result2) {
							pontosMineiro = 1 + pontosMineiro;
						} else {
							pontosMineiro = 0 + pontosMineiro;
						}

						totaljogosMineiro = 1 + totaljogosMineiro;
					}

					if (j.equals("Atlético Mineiro")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultMineiro = result2 + resultMineiro;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultMineiroGC = resultMineiroGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultMineiroSG = resultMineiro - resultMineiroGC;

						if (result2 > result1) {
							pontosMineiro = 3 + pontosMineiro;
						} else if (result2 == result1) {
							pontosMineiro = 1 + pontosMineiro;
						} else {
							pontosMineiro = 0 + pontosMineiro;
						}

						totaljogosMineiro = 1 + totaljogosMineiro;
					}

					if (i.equals("Bahia")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultBahia = result1 + resultBahia;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultBahiaGC = result2 + resultBahiaGC;

						// SALDO DE GOLS EM CASA:
						resultBahiaSG = resultBahia - resultBahiaGC;

						if (result1 > result2) {
							pontosBahia = 3 + pontosBahia;
						} else if (result1 == result2) {
							pontosBahia = 1 + pontosBahia;
						} else {
							pontosBahia = 0 + pontosBahia;
						}

						totaljogosBahia = 1 + totaljogosBahia;
					}

					if (j.equals("Bahia")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultBahia = result2 + resultBahia;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultBahiaGC = resultBahiaGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultBahiaSG = resultBahia - resultBahiaGC;

						if (result2 > result1) {
							pontosBahia = 3 + pontosBahia;
						} else if (result2 == result1) {
							pontosBahia = 1 + pontosBahia;
						} else {
							pontosBahia = 0 + pontosBahia;
						}

						totaljogosBahia = 1 + totaljogosBahia;
					}

					if (i.equals("Botafogo")) {
						// GOLS FEITOS(PRO):
						resultBotafogo = result1 + resultBotafogo;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultBotafogoGC = result2 + resultBotafogoGC;

						// SALDO DE GOLS EM CASA:
						resultBotafogoSG = resultBotafogo - resultBotafogoGC;

						if (result1 > result2) {
							pontosBotafogo = 3 + pontosBotafogo;
						} else if (result1 == result2) {
							pontosBotafogo = 1 + pontosBotafogo;
						} else {
							pontosBotafogo = 0 + pontosBotafogo;
						}

						totaljogosBotafogo = 1 + totaljogosBotafogo;
					}

					if (j.equals("Botafogo")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultBotafogo = result2 + resultBotafogo;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultBotafogoGC = resultBotafogoGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultBotafogoSG = resultBotafogo - resultBotafogoGC;

						if (result2 > result1) {
							pontosBotafogo = 3 + pontosBotafogo;
						} else if (result2 == result1) {
							pontosBotafogo = 1 + pontosBotafogo;
						} else {
							pontosBotafogo = 0 + pontosBotafogo;
						}

						totaljogosBotafogo = 1 + totaljogosBotafogo;
					}

					if (i.equals("Ceara")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultCeara = result1 + resultCeara;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultCearaGC = result2 + resultCearaGC;

						// SALDO DE GOLS EM CASA:
						resultCearaSG = resultCeara - resultCearaGC;

						if (result1 > result2) {
							pontosCeara = 3 + pontosCeara;
						} else if (result1 == result2) {
							pontosCeara = 1 + pontosCeara;
						} else {
							pontosCeara = 0 + pontosCeara;
						}

						totaljogosCeara = 1 + totaljogosCeara;
					}

					if (j.equals("Ceara")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultCeara = result2 + resultCeara;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultCearaGC = resultCearaGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultCearaSG = resultCeara - resultCearaGC;

						if (result2 > result1) {
							pontosCeara = 3 + pontosCeara;
						} else if (result2 == result1) {
							pontosCeara = 1 + pontosCeara;
						} else {
							pontosCeara = 0 + pontosCeara;
						}

						totaljogosCeara = 1 + totaljogosCeara;
					}

					if (i.equals("Corinthians")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultCorinthians = result1 + resultCorinthians;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultCorinthiansGC = result2 + resultCorinthiansGC;

						// SALDO DE GOLS EM CASA:
						resultCorinthiansSG = resultCorinthians - resultCorinthiansGC;

						if (result1 > result2) {
							pontosCorinthians = 3 + pontosCorinthians;
						} else if (result1 == result2) {
							pontosCorinthians = 1 + pontosCorinthians;
						} else {
							pontosCorinthians = 0 + pontosCorinthians;
						}

						totaljogosCorinthians = 1 + totaljogosCorinthians;
					}

					if (j.equals("Corinthians")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultCorinthians = result2 + resultCorinthians;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultCorinthiansGC = resultCorinthiansGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultCorinthiansSG = resultCorinthians - resultCorinthiansGC;

						if (result2 > result1) {
							pontosCorinthians = 3 + pontosCorinthians;
						} else if (result2 == result1) {
							pontosCorinthians = 1 + pontosCorinthians;
						} else {
							pontosCorinthians = 0 + pontosCorinthians;
						}

						totaljogosCorinthians = 1 + totaljogosCorinthians;
					}

					if (i.equals("Coritiba")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultCoritiba = result1 + resultCoritiba;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultCoritibaGC = result2 + resultCoritibaGC;

						// SALDO DE GOLS EM CASA:
						resultCoritibaSG = resultCoritiba - resultCoritibaGC;

						if (result1 > result2) {
							pontosCoritiba = 3 + pontosCoritiba;
						} else if (result1 == result2) {
							pontosCoritiba = 1 + pontosCoritiba;
						} else {
							pontosCoritiba = 0 + pontosCoritiba;
						}

						totaljogosCoritiba = 1 + totaljogosCoritiba;
					}

					if (j.equals("Coritiba")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultCoritiba = result2 + resultCoritiba;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultCoritibaGC = resultCoritibaGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultCoritibaSG = resultCoritiba - resultCoritibaGC;

						if (result2 > result1) {
							pontosCoritiba = 3 + pontosCoritiba;
						} else if (result2 == result1) {
							pontosCoritiba = 1 + pontosCoritiba;
						} else {
							pontosCoritiba = 0 + pontosCoritiba;
						}

						totaljogosCoritiba = 1 + totaljogosCoritiba;
					}

					if (i.equals("Flamengo")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultFlamengo = result1 + resultFlamengo;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultFlamengoGC = result2 + resultFlamengoGC;

						// SALDO DE GOLS EM CASA:
						resultFlamengoSG = resultFlamengo - resultFlamengoGC;

						if (result1 > result2) {
							pontosFlamengo = 3 + pontosFlamengo;
						} else if (result1 == result2) {
							pontosFlamengo = 1 + pontosFlamengo;
						} else {
							pontosFlamengo = 0 + pontosFlamengo;
						}

						totaljogosFlamengo = 1 + totaljogosFlamengo;
					}

					if (j.equals("Flamengo")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultFlamengo = result2 + resultFlamengo;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultFlamengoGC = resultFlamengoGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultFlamengoSG = resultFlamengo - resultFlamengoGC;

						if (result2 > result1) {
							pontosFlamengo = 3 + pontosFlamengo;
						} else if (result2 == result1) {
							pontosFlamengo = 1 + pontosFlamengo;
						} else {
							pontosFlamengo = 0 + pontosFlamengo;
						}

						totaljogosFlamengo = 1 + totaljogosFlamengo;
					}

					if (i.equals("Fluminense")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultFluminense = result1 + resultFluminense;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultFluminenseGC = result2 + resultFluminenseGC;

						// SALDO DE GOLS EM CASA:
						resultFluminenseSG = resultFluminense - resultFluminenseGC;

						if (result1 > result2) {
							pontosFluminense = 3 + pontosFluminense;
						} else if (result1 == result2) {
							pontosFluminense = 1 + pontosFluminense;
						} else {
							pontosFluminense = 0 + pontosFluminense;
						}

						totaljogosFluminense = 1 + totaljogosFluminense;
					}

					if (j.equals("Fluminense")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultFluminense = result2 + resultFluminense;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultFluminenseGC = resultFluminenseGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultFluminenseSG = resultFluminense - resultFluminenseGC;

						if (result2 > result1) {
							pontosFluminense = 3 + pontosFluminense;
						} else if (result2 == result1) {
							pontosFluminense = 1 + pontosFluminense;
						} else {
							pontosFluminense = 0 + pontosFluminense;
						}

						totaljogosFluminense = 1 + totaljogosFluminense;
					}

					if (i.equals("Fortaleza")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultFortaleza = result1 + resultFortaleza;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultFortalezaGC = result2 + resultFortalezaGC;

						// SALDO DE GOLS EM CASA:
						resultFortalezaSG = resultFortaleza - resultFortalezaGC;

						if (result1 > result2) {
							pontosFortaleza = 3 + pontosFortaleza;
						} else if (result1 == result2) {
							pontosFortaleza = 1 + pontosFortaleza;
						} else {
							pontosFortaleza = 0 + pontosFortaleza;
						}

						totaljogosFortaleza = 1 + totaljogosFortaleza;
					}

					if (j.equals("Fortaleza")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultFortaleza = result2 + resultFortaleza;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultFortalezaGC = resultFortalezaGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultFortalezaSG = resultFortaleza - resultFortalezaGC;

						if (result2 > result1) {
							pontosFortaleza = 3 + pontosFortaleza;
						} else if (result2 == result1) {
							pontosFortaleza = 1 + pontosFortaleza;
						} else {
							pontosFortaleza = 0 + pontosFortaleza;
						}

						totaljogosFortaleza = 1 + totaljogosFortaleza;
					}

					if (i.equals("Goias")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultGoias = result1 + resultGoias;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultGoiasGC = result2 + resultGoiasGC;

						// SALDO DE GOLS EM CASA:
						resultGoiasSG = resultGoias - resultGoiasGC;

						if (result1 > result2) {
							pontosGoias = 3 + pontosGoias;
						} else if (result1 == result2) {
							pontosGoias = 1 + pontosGoias;
						} else {
							pontosGoias = 0 + pontosGoias;
						}

						totaljogosGoias = 1 + totaljogosGoias;
					}

					if (j.equals("Goias")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultGoias = result2 + resultGoias;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultGoiasGC = resultGoiasGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultGoiasSG = resultGoias - resultGoiasGC;

						if (result2 > result1) {
							pontosGoias = 3 + pontosGoias;
						} else if (result2 == result1) {
							pontosGoias = 1 + pontosGoias;
						} else {
							pontosGoias = 0 + pontosGoias;
						}

						totaljogosGoias = 1 + totaljogosGoias;
					}

					if (i.equals("Grêmio")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultGremio = result1 + resultGremio;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultGremioGC = result2 + resultGremioGC;

						// SALDO DE GOLS EM CASA:
						resultGremioSG = resultGremio - resultGremioGC;

						if (result1 > result2) {
							pontosGremio = 3 + pontosGremio;
						} else if (result1 == result2) {
							pontosGremio = 1 + pontosGremio;
						} else {
							pontosGremio = 0 + pontosGremio;
						}

						totaljogosGremio = 1 + totaljogosGremio;
					}

					if (j.equals("Grêmio")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultGremio = result2 + resultGremio;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultGremioGC = resultGremioGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultGremioSG = resultGremio - resultGremioGC;

						if (result2 > result1) {
							pontosGremio = 3 + pontosGremio;
						} else if (result2 == result1) {
							pontosGremio = 1 + pontosGremio;
						} else {
							pontosGremio = 0 + pontosGremio;
						}

						totaljogosGremio = 1 + totaljogosGremio;
					}

					if (i.equals("Internacional")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultInternacional = result1 + resultInternacional;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultInternacionalGC = result2 + resultInternacionalGC;

						// SALDO DE GOLS EM CASA:
						resultInternacionalSG = resultInternacional - resultInternacionalGC;

						if (result1 > result2) {
							pontosInternacional = 3 + pontosInternacional;
						} else if (result1 == result2) {
							pontosInternacional = 1 + pontosInternacional;
						} else {
							pontosInternacional = 0 + pontosInternacional;
						}

						totaljogosInternacional = 1 + totaljogosInternacional;
					}

					if (j.equals("Internacional")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultInternacional = result2 + resultInternacional;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultInternacionalGC = resultInternacionalGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultInternacionalSG = resultInternacional - resultInternacionalGC;

						if (result2 > result1) {
							pontosInternacional = 3 + pontosInternacional;
						} else if (result2 == result1) {
							pontosInternacional = 1 + pontosInternacional;
						} else {
							pontosInternacional = 0 + pontosInternacional;
						}

						totaljogosInternacional = 1 + totaljogosInternacional;
					}

					if (i.equals("Palmeiras")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultPalmeiras = result1 + resultPalmeiras;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultPalmeirasGC = result2 + resultPalmeirasGC;

						// SALDO DE GOLS EM CASA:
						resultPalmeirasSG = resultPalmeiras - resultPalmeirasGC;

						if (result1 > result2) {
							pontosPalmeiras = 3 + pontosPalmeiras;
						} else if (result1 == result2) {
							pontosPalmeiras = 1 + pontosPalmeiras;
						} else {
							pontosPalmeiras = 0 + pontosPalmeiras;
						}

						totaljogosPalmeiras = 1 + totaljogosPalmeiras;
					}

					if (j.equals("Palmeiras")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultPalmeiras = result2 + resultPalmeiras;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultPalmeirasGC = resultPalmeirasGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultPalmeirasSG = resultPalmeiras - resultPalmeirasGC;

						if (result2 > result1) {
							pontosPalmeiras = 3 + pontosPalmeiras;
						} else if (result2 == result1) {
							pontosPalmeiras = 1 + pontosPalmeiras;
						} else {
							pontosPalmeiras = 0 + pontosPalmeiras;
						}

						totaljogosPalmeiras = 1 + totaljogosPalmeiras;
					}

					if (i.equals("Red Bull Bragantino")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultRedbull = result1 + resultRedbull;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultRedbullGC = result2 + resultRedbullGC;

						// SALDO DE GOLS EM CASA:
						resultRedbullSG = resultRedbull - resultRedbullGC;

						if (result1 > result2) {
							pontosRedbull = 3 + pontosRedbull;
						} else if (result1 == result2) {
							pontosRedbull = 1 + pontosRedbull;
						} else {
							pontosRedbull = 0 + pontosRedbull;
						}

						totaljogosRedbull = 1 + totaljogosRedbull;
					}

					if (j.equals("Red Bull Bragantino")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultRedbull = result2 + resultRedbull;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultRedbullGC = resultRedbullGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultRedbullSG = resultRedbull - resultRedbullGC;

						if (result2 > result1) {
							pontosRedbull = 3 + pontosRedbull;
						} else if (result2 == result1) {
							pontosRedbull = 1 + pontosRedbull;
						} else {
							pontosRedbull = 0 + pontosRedbull;
						}

						totaljogosRedbull = 1 + totaljogosRedbull;
					}

					if (i.equals("Santos")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultSantos = result1 + resultSantos;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultSantosGC = result2 + resultSantosGC;

						// SALDO DE GOLS EM CASA:
						resultSantosSG = resultSantos - resultSantosGC;

						if (result1 > result2) {
							pontosSantos = 3 + pontosSantos;
						} else if (result1 == result2) {
							pontosSantos = 1 + pontosSantos;
						} else {
							pontosSantos = 0 + pontosSantos;
						}

						totaljogosSantos = 1 + totaljogosSantos;
					}

					if (j.equals("Santos")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultSantos = result2 + resultSantos;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultSantosGC = resultSantosGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultSantosSG = resultSantos - resultSantosGC;

						if (result2 > result1) {
							pontosSantos = 3 + pontosSantos;
						} else if (result2 == result1) {
							pontosSantos = 1 + pontosSantos;
						} else {
							pontosSantos = 0 + pontosSantos;
						}

						totaljogosSantos = 1 + totaljogosSantos;
					}

					if (i.equals("São Paulo")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultSaopaulo = result1 + resultSaopaulo;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultSaopauloGC = result2 + resultSaopauloGC;

						// SALDO DE GOLS EM CASA:
						resultSaopauloSG = resultSaopaulo - resultSaopauloGC;

						if (result1 > result2) {
							pontosSaopaulo = 3 + pontosSaopaulo;
						} else if (result1 == result2) {
							pontosSaopaulo = 1 + pontosSaopaulo;
						} else {
							pontosSaopaulo = 0 + pontosSaopaulo;
						}

						totaljogosSaopaulo = 1 + totaljogosSaopaulo;
					}

					if (j.equals("São Paulo")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultSaopaulo = result2 + resultSaopaulo;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultSaopauloGC = resultSaopauloGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultSaopauloSG = resultSaopaulo - resultSaopauloGC;

						if (result2 > result1) {
							pontosSaopaulo = 3 + pontosSaopaulo;
						} else if (result2 == result1) {
							pontosSaopaulo = 1 + pontosSaopaulo;
						} else {
							pontosSaopaulo = 0 + pontosSaopaulo;
						}

						totaljogosSaopaulo = 1 + totaljogosSaopaulo;
					}

					if (i.equals("Sport")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultSport = result1 + resultSport;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultSportGC = result2 + resultSportGC;

						// SALDO DE GOLS EM CASA:
						resultSportSG = resultSport - resultSportGC;

						if (result1 > result2) {
							pontosSport = 3 + pontosSport;
						} else if (result1 == result2) {
							pontosSport = 1 + pontosSport;
						} else {
							pontosSport = 0 + pontosSport;
						}

						totaljogosSport = 1 + totaljogosSport;
					}

					if (j.equals("Sport")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultSport = result2 + resultSport;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultSportGC = resultSportGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultSportSG = resultSport - resultSportGC;

						if (result2 > result1) {
							pontosSport = 3 + pontosSport;
						} else if (result2 == result1) {
							pontosSport = 1 + pontosSport;
						} else {
							pontosSport = 0 + pontosSport;
						}

						totaljogosSport = 1 + totaljogosSport;
					}

					if (i.equals("Vasco da Gama")) {
						// GOLS FEITOS(PRO) EM CASA:
						resultVasco = result1 + resultVasco;

						// GOLS LEVADOS(CONTRA) EM DE CASA::
						resultVascoGC = result2 + resultVascoGC;

						// SALDO DE GOLS EM CASA:
						resultVascoSG = resultVasco - resultVascoGC;

						if (result1 > result2) {
							pontosVasco = 3 + pontosVasco;
						} else if (result1 == result2) {
							pontosVasco = 1 + pontosVasco;
						} else {
							pontosVasco = 0 + pontosVasco;
						}

						totaljogosVasco = 1 + totaljogosVasco;
					}

					if (j.equals("Vasco da Gama")) {
						// GOLS FEITOS(PRO) FORA DE CASA:
						resultVasco = result2 + resultVasco;

						// GOLS LEVADOS(CONTRA) FORA DE CASA:
						resultVascoGC = resultVascoGC + result1;

						// SALDO DE GOLS FORA DE CASA:
						resultVascoSG = resultVasco - resultVascoGC;

						if (result2 > result1) {
							pontosVasco = 3 + pontosVasco;
						} else if (result2 == result1) {
							pontosVasco = 1 + pontosVasco;
						} else {
							pontosVasco = 0 + pontosVasco;
						}

						totaljogosVasco = 1 + totaljogosVasco;
					}

				}
			}

		}

		// IMPRIMIRÁ OS RESULTADOS DE TODOS OS JOGOS

		System.out.println("\n ------------ Resultados Gerais ------------ \n");

		System.out.println("\n ------------  Paranaense ------------ \n");
		System.out.println("Gols Paranaense: " + resultParana);
		System.out.println("Gols sofridos Parananese: " + resultParanaGC);
		System.out.println("Saldo de Gols do Paranaense: " + resultParanaSG);
		System.out.println("Pontos acumulativos Paranaense: " + pontosParana);
		System.out.println("Total de Jogos do Paranaense: " + totaljogosParana);

		System.out.println("\n");

		System.out.println(" ------------  Goieniense ------------ ");
		System.out.println("Gols Goieniense: " + resultGoieniense);
		System.out.println("Gols sofridos Goieniense: " + resultGoienienseGC);
		System.out.println("Saldo de Gols do Goieniense: " + resultGoienienseSG);
		System.out.println("Pontos acumulativos Goieniense: " + pontosGoieniense);
		System.out.println("Total de Jogos do Goieniense: " + totaljogosGoieniense);

		System.out.println("\n");

		System.out.println(" ------------  Mineiro ------------ ");
		System.out.println("Gols Mineiro: " + resultMineiro);
		System.out.println("Gols sofridos Mineiro: " + resultMineiroGC);
		System.out.println("Saldo de Gols do Mineiro: " + resultMineiroSG);
		System.out.println("Pontos acumulativos Mineiro: " + pontosMineiro);
		System.out.println("Total de Jogos do Mineiro: " + totaljogosMineiro);

		System.out.println("\n");

		System.out.println(" ------------  Bahia ------------ ");
		System.out.println("Gols Bahia: " + resultBahia);
		System.out.println("Gols sofridos Bahia: " + resultBahiaGC);
		System.out.println("Saldo de Gols do Bahia: " + resultBahiaSG);
		System.out.println("Pontos acumulativos Bahia: " + pontosBahia);
		System.out.println("Total de Jogos do Bahia: " + totaljogosBahia);

		System.out.println("\n");

		System.out.println(" ------------  Botafogo ------------ ");
		System.out.println("Gols Botafogo: " + resultBotafogo);
		System.out.println("Gols sofridos Botafogo: " + resultBotafogoGC);
		System.out.println("Saldo de Gols do Botafogo: " + resultBotafogoSG);
		System.out.println("Pontos acumulativos Botafogo: " + pontosBotafogo);
		System.out.println("Total de Jogos do Botafogo: " + totaljogosBotafogo);

		System.out.println("\n");

		System.out.println(" ------------  Ceara ------------ ");
		System.out.println("Gols Ceara: " + resultCeara);
		System.out.println("Gols sofridos Ceara: " + resultCearaGC);
		System.out.println("Saldo de Gols do Ceara: " + resultCearaSG);
		System.out.println("Pontos acumulativos Ceara: " + pontosCeara);
		System.out.println("Total de Jogos do Ceara: " + totaljogosCeara);

		System.out.println("\n");

		System.out.println(" ------------  Corinthians ------------ ");
		System.out.println("Gols Corinthians: " + resultCorinthians);
		System.out.println("Gols sofridos Corinthians: " + resultCorinthiansGC);
		System.out.println("Saldo de Gols do Corinthians: " + resultCorinthiansSG);
		System.out.println("Pontos acumulativos Corinthians: " + pontosCorinthians);
		System.out.println("Total de Jogos do Corinthians: " + totaljogosCorinthians);

		System.out.println("\n");

		System.out.println(" ------------  Coritiba ------------ ");
		System.out.println("Gols Coritiba: " + resultCoritiba);
		System.out.println("Gols sofridos Coritiba: " + resultCoritibaGC);
		System.out.println("Saldo de Gols do Coritiba: " + resultCoritibaSG);
		System.out.println("Pontos acumulativos Coritiba: " + pontosCoritiba);
		System.out.println("Total de Jogos do Coritiba: " + totaljogosCoritiba);

		System.out.println("\n");

		System.out.println(" ------------  Flamengo ------------ ");
		System.out.println("Gols Flamengo: " + resultFlamengo);
		System.out.println("Gols sofridos Flamengo: " + resultFlamengoGC);
		System.out.println("Saldo de Gols do Flamengo: " + resultFlamengoSG);
		System.out.println("Pontos acumulativos Flamengo: " + pontosFlamengo);
		System.out.println("Total de Jogos do Flamengo: " + totaljogosFlamengo);

		System.out.println("\n");

		System.out.println(" ------------  Fluminense ------------ ");
		System.out.println("Gols Fluminense: " + resultFluminense);
		System.out.println("Gols sofridos Fluminense: " + resultFluminenseGC);
		System.out.println("Saldo de Gols do Fluminense: " + resultFluminenseSG);
		System.out.println("Pontos acumulativos Fluminense: " + pontosFluminense);
		System.out.println("Total de Jogos do Fluminense: " + totaljogosFluminense);

		System.out.println("\n");

		System.out.println(" ------------  Fortaleza ------------ ");
		System.out.println("Gols Fortaleza: " + resultFortaleza);
		System.out.println("Gols sofridos Fortaleza: " + resultFortalezaGC);
		System.out.println("Saldo de Gols do Fortaleza: " + resultFortalezaSG);
		System.out.println("Pontos acumulativos Fortaleza: " + pontosFortaleza);
		System.out.println("Total de Jogos do Fortaleza: " + totaljogosFortaleza);

		System.out.println("\n");

		System.out.println(" ------------  Goias ------------ ");
		System.out.println("Gols Goias: " + resultGoias);
		System.out.println("Gols sofridos Goias: " + resultGoiasGC);
		System.out.println("Saldo de Gols do Goias: " + resultGoiasSG);
		System.out.println("Pontos acumulativos Goias: " + pontosGoias);
		System.out.println("Total de Jogos do Goias: " + totaljogosGoias);

		System.out.println("\n");

		System.out.println(" ------------  Grêmio ------------ ");
		System.out.println("Gols Grêmio: " + resultGremio);
		System.out.println("Gols sofridos Grêmio: " + resultGremioGC);
		System.out.println("Saldo de Gols do Grêmio: " + resultGremioSG);
		System.out.println("Pontos acumulativos Grêmio: " + pontosGremio);
		System.out.println("Total de Jogos do Grêmio: " + totaljogosGremio);

		System.out.println("\n");

		System.out.println(" ------------  Internacional ------------ ");
		System.out.println("Gols Internacional: " + resultInternacional);
		System.out.println("Gols sofridos Internacional: " + resultInternacionalGC);
		System.out.println("Saldo de Gols do Internacional: " + resultInternacionalSG);
		System.out.println("Pontos acumulativos Internacional: " + pontosInternacional);
		System.out.println("Total de Jogos do Internacional: " + totaljogosInternacional);

		System.out.println("\n");

		System.out.println(" ------------  Palmeiras ------------ ");
		System.out.println("Gols Palmeiras: " + resultPalmeiras);
		System.out.println("Gols sofridos Palmeiras: " + resultPalmeirasGC);
		System.out.println("Saldo de Gols do Palmeiras: " + resultPalmeirasSG);
		System.out.println("Pontos acumulativos Palmeiras: " + pontosPalmeiras);
		System.out.println("Total de Jogos do Palmeiras: " + totaljogosPalmeiras);

		System.out.println("\n");

		System.out.println(" ------------  Red Bull Bragantino  ------------ ");
		System.out.println("Gols Red Bull Bragantino: " + resultRedbull);
		System.out.println("Gols sofridos Red Bull Bragantino: " + resultRedbullGC);
		System.out.println("Saldo de Gols do Red Bull Bragantino: " + resultRedbullSG);
		System.out.println("Pontos acumulativos Red Bull Bragantino: " + pontosRedbull);
		System.out.println("Total de Jogos do Red Bull Bragantino: " + totaljogosRedbull);

		System.out.println("\n");

		System.out.println(" ------------  Santos ------------ ");
		System.out.println("Gols Santos: " + resultSantos);
		System.out.println("Gols sofridos Santos: " + resultSantosGC);
		System.out.println("Saldo de Gols do Santos: " + resultSantosSG);
		System.out.println("Pontos acumulativos Santos: " + pontosSantos);
		System.out.println("Total de Jogos do Santos: " + totaljogosSantos);

		System.out.println("\n");

		System.out.println(" ------------  São Paulo ------------ ");
		System.out.println("Gols São Paulo: " + resultSaopaulo);
		System.out.println("Gols sofridos São Paulo: " + resultSaopauloGC);
		System.out.println("Saldo de Gols do São Paulo: " + resultSaopauloSG);
		System.out.println("Pontos acumulativos São Paulo: " + pontosSaopaulo);
		System.out.println("Total de Jogos do São Paulo: " + totaljogosSaopaulo);

		System.out.println("\n");

		System.out.println(" ------------  Sport ------------ ");
		System.out.println("Gols Sport: " + resultSport);
		System.out.println("Gols sofridos Sport: " + resultSportGC);
		System.out.println("Saldo de Gols do Sport: " + resultSportSG);
		System.out.println("Pontos acumulativos Sport: " + pontosSport);
		System.out.println("Total de Jogos do Sport: " + totaljogosSport);

		System.out.println("\n");

		System.out.println(" ------------  Vasco da Gama ------------ ");
		System.out.println("Gols Vasco da Gama: " + resultVasco);
		System.out.println("Gols sofridos Vasco da Gama: " + resultVascoGC);
		System.out.println("Saldo de Gols do Vasco da Gama: " + resultVascoSG);
		System.out.println("Pontos acumulativos Vasco da Gama: " + pontosVasco);
		System.out.println("Total de Jogos do Vasco da Gama: " + totaljogosVasco);

		System.out.println("\n");

		// LISTA que aloca as PONTUAÇÕES TOTAIS (acumuladas) dos times, em ordem.
		List<Integer> pontuacaoTotal = new ArrayList<>();

		pontuacaoTotal.add(pontosParana);
		pontuacaoTotal.add(pontosGoieniense);
		pontuacaoTotal.add(pontosMineiro);
		pontuacaoTotal.add(pontosBahia);
		pontuacaoTotal.add(pontosBotafogo);
		pontuacaoTotal.add(pontosCeara);
		pontuacaoTotal.add(pontosCorinthians);
		pontuacaoTotal.add(pontosCoritiba);
		pontuacaoTotal.add(pontosFlamengo);
		pontuacaoTotal.add(pontosFluminense);
		pontuacaoTotal.add(pontosFortaleza);
		pontuacaoTotal.add(pontosGoias);
		pontuacaoTotal.add(pontosGremio);
		pontuacaoTotal.add(pontosInternacional);
		pontuacaoTotal.add(pontosPalmeiras);
		pontuacaoTotal.add(pontosRedbull);
		pontuacaoTotal.add(pontosSantos);
		pontuacaoTotal.add(pontosSaopaulo);
		pontuacaoTotal.add(pontosSport);
		pontuacaoTotal.add(pontosVasco);

		// LISTA que aloca em tipo String, os nomes de todos os times, seguindo a ordem.
		List<String> todosTimes = new ArrayList<>();
		todosTimes.add("Athletico Paranaense");
		todosTimes.add("Atlético Goienense");
		todosTimes.add("Atlético Mineiro");
		todosTimes.add("Bahia");
		todosTimes.add("Botafogo");
		todosTimes.add("Ceara");
		todosTimes.add("Corinthians");
		todosTimes.add("Coritiba");
		todosTimes.add("Flamengo");
		todosTimes.add("Fluminense");
		todosTimes.add("Fortaleza");
		todosTimes.add("Goias");
		todosTimes.add("Gremio");
		todosTimes.add("Internacional");
		todosTimes.add("Palmeiras");
		todosTimes.add("Red Bull Bragantino");
		todosTimes.add("Santos");
		todosTimes.add("São Paulo");
		todosTimes.add("Sport");
		todosTimes.add("Vasco");

		// LISTA que alocal os resultados dos SALDO DE GOLS de todos os times, em ordem.
		List<Integer> saldodeGols = new ArrayList<>();

		// TESTE PARA IDENTIFICAR OS NOMES DOS TIMES
		System.out.println(todosTimes);
		// TESTE PARA IDENTIFICAR OS PONTUADORES EM RESPECTIVA ORDEM COM OS TIMES
		System.out.println(pontuacaoTotal + "\n");

		int maiorPontuador = Collections.max(pontuacaoTotal);
		int menorPontuador = Collections.min(pontuacaoTotal);

		if (pontosParana >= maiorPontuador) {
			saldodeGols.add(resultParanaSG);
		}
		if (pontosGoieniense >= maiorPontuador) {
			saldodeGols.add(resultGoienienseSG);
		}
		if (pontosMineiro >= maiorPontuador) {
			saldodeGols.add(resultMineiroSG);
		}
		if (pontosBahia >= maiorPontuador) {
			saldodeGols.add(resultBahiaSG);
		}
		if (pontosBotafogo >= maiorPontuador) {
			saldodeGols.add(resultBotafogoSG);
		}
		if (pontosCeara >= maiorPontuador) {
			saldodeGols.add(resultCearaSG);
		}
		if (pontosCorinthians >= maiorPontuador) {
			saldodeGols.add(resultCorinthiansSG);
		}
		if (pontosCoritiba >= maiorPontuador) {
			saldodeGols.add(resultCoritibaSG);
		}
		if (pontosFlamengo >= maiorPontuador) {
			saldodeGols.add(resultFlamengoSG);
		}
		if (pontosFluminense >= maiorPontuador) {
			saldodeGols.add(resultFluminenseSG);
		}
		if (pontosFortaleza >= maiorPontuador) {
			saldodeGols.add(resultFortalezaSG);
		}
		if (pontosGoias >= maiorPontuador) {
			saldodeGols.add(resultGoiasSG);
		}
		if (pontosGremio >= maiorPontuador) {
			saldodeGols.add(resultGremioSG);
		}
		if (pontosInternacional >= maiorPontuador) {
			saldodeGols.add(resultInternacionalSG);
		}
		if (pontosPalmeiras >= maiorPontuador) {
			saldodeGols.add(resultPalmeirasSG);
		}
		if (pontosRedbull >= maiorPontuador) {
			saldodeGols.add(resultRedbullSG);
		}
		if (pontosSantos >= maiorPontuador) {
			saldodeGols.add(resultSantosSG);
		}
		if (pontosSaopaulo >= maiorPontuador) {
			saldodeGols.add(resultSaopauloSG);
		}
		if (pontosSport >= maiorPontuador) {
			saldodeGols.add(resultSportSG);
		}
		if (pontosVasco >= maiorPontuador) {
			saldodeGols.add(resultVascoSG);
		}

		/*
		 * FÓRMULA QUE POSICIONA OS MENORES E MAIORES PONTUADORES, DESCONSIDERANDO OS
		 * NOMES DOS TIMES - LISTA NÃO ORDENADA.
		 */
		Collections.sort(pontuacaoTotal);
		System.out.println("                          PONTUAÇÃO EM ORDEM CRESCENTE ");
		System.out.println("MENOR -------------------------------------------------------------------- MAIOR");
		System.out.println(pontuacaoTotal);

		System.out.println("\n");

		/*
		 * FÓRMULAS QUE IDENTIFICAM OS MENORES E MAIORES PONTUADORES E OS QUE POSSUEM
		 * MENORES E MAIORES SALDOS DE GOLS.
		 */

		int maiorGoleador = Collections.max(saldodeGols);

		int menorGoleador = Collections.min(saldodeGols);

		// DEFINE O CAMPEÃO BRASILEIRO COM BASE NA LISTA DO "MAIOR" PONTUADOR e
		// GOLEADOR.

		System.out.println("O campeão brasileiro de 2020 é: ");

		if (pontosParana == maiorPontuador && resultParanaSG == maiorGoleador) {
			System.out.println("Athletico Paranaense");
			System.out.println("Com a pontuação de: " + pontosParana + " pontos");

		} else if (pontosGoieniense == maiorPontuador && resultGoienienseSG == maiorGoleador) {
			System.out.println("Atlético Goieniense");
			System.out.println("Com a pontuação de: " + pontosGoieniense + " pontos");

		} else if (pontosMineiro == maiorPontuador && resultMineiroSG == maiorGoleador) {
			System.out.println("Atlético Mineiro");
			System.out.println("Com a pontuação de: " + pontosMineiro + " pontos");

		} else if (pontosBahia == maiorPontuador && resultBahiaSG == maiorGoleador) {
			System.out.println("Bahia");
			System.out.println("Com a pontuação de: " + pontosBahia + " pontos");

		} else if (pontosBotafogo == maiorPontuador && resultBotafogoSG == maiorGoleador) {
			System.out.println("Botafogo");
			System.out.println("Com a pontuação de: " + pontosBotafogo + " pontos");

		} else if (pontosCeara == maiorPontuador && resultCearaSG == maiorGoleador) {
			System.out.println("Ceara");
			System.out.println("Com a pontuação de: " + pontosCeara + " pontos");

		} else if (pontosCorinthians == maiorPontuador && resultCorinthiansSG == maiorGoleador) {
			System.out.println("Corinthians ");
			System.out.println("Com a pontuação de: " + pontosCorinthians + " pontos");

		} else if (pontosCoritiba == maiorPontuador && resultCoritibaSG == maiorGoleador) {
			System.out.println("Coritiba");
			System.out.println("Com a pontuação de: " + pontosCoritiba + " pontos");

		} else if (pontosFlamengo == maiorPontuador && resultFlamengoSG == maiorGoleador) {
			System.out.println("Flamengo");
			System.out.println("Com a pontuação de: " + pontosFlamengo + " pontos");

		} else if (pontosFluminense == maiorPontuador && resultFluminenseSG == maiorGoleador) {
			System.out.println("Fluminense");
			System.out.println("Com a pontuação de: " + pontosFluminense + " pontos");

		} else if (pontosFortaleza == maiorPontuador && resultFortalezaSG == maiorGoleador) {
			System.out.println("Fortaleza");
			System.out.println("Com a pontuação de: " + pontosFortaleza + " pontos");

		} else if (pontosGoias == maiorPontuador && resultGoiasSG == maiorGoleador) {
			System.out.println("Goias");
			System.out.println("Com a pontuação de: " + pontosGoias + " pontos");

		} else if (pontosGremio == maiorPontuador && resultGremioSG == maiorGoleador) {
			System.out.println("Grêmio Campeão!");
			System.out.println("Com a pontuação de: " + pontosGremio + " pontos");

		} else if (pontosInternacional == maiorPontuador && resultInternacionalSG == maiorGoleador) {
			System.out.println("Internacional");
			System.out.println("Com a pontuação de: " + pontosInternacional + " pontos");

		} else if (pontosPalmeiras == maiorPontuador && resultPalmeirasSG == maiorGoleador) {
			System.out.println("Palmeiras");
			System.out.println("Com a pontuação de: " + pontosPalmeiras + " pontos");

		} else if (pontosRedbull == maiorPontuador && resultRedbullSG == maiorGoleador) {
			System.out.println("Red Bull Bragantino");
			System.out.println("Com a pontuação de: " + pontosRedbull + " pontos");

		} else if (pontosSantos == maiorPontuador && resultSantosSG == maiorGoleador) {
			System.out.println("Santos");
			System.out.println("Com a pontuação de: " + pontosSantos + " pontos");

		} else if (pontosSaopaulo == maiorPontuador && resultSaopauloSG == maiorGoleador) {
			System.out.println("Sao Paulo");
			System.out.println("Com a pontuação de: " + pontosSaopaulo + " pontos");

		} else if (pontosSport == maiorPontuador && resultSportSG == maiorGoleador) {
			System.out.println("Sport");
			System.out.println("Com a pontuação de: " + pontosSport + " pontos");

		} else if (pontosVasco == maiorPontuador && resultVascoSG == maiorGoleador) {
			System.out.println("Vasco");
			System.out.println("Com a pontuação de: " + pontosVasco + " pontos");

		} else {
			System.out.println("SYSTEM ERROR - NOT FOUND");
		}

		System.out.println("\n---------------------------------------------");

		/*
		 * //DEFINI O REBAIXADO DO BRASILEIRO COM BASE NA LISTA DO "MENOR" PONTUADOR.
		 * System.out.println("\nO último colocado do  brasileiro de 2020 é: "); if
		 * (menor == pontosParana) { System.out.println("Athletico Paranaense");
		 * System.out.println("Com a pontuação de: " + pontosParana + " pontos");
		 * 
		 * } else if ( menor == pontosGoieniense) {
		 * System.out.println("Atlético Goieniense");
		 * System.out.println("Com a pontuação de: " + pontosGoieniense + " pontos");
		 * 
		 * } else if (menor == pontosMineiro) { System.out.println("Atlético Mineiro");
		 * System.out.println("Com a pontuação de: " + pontosMineiro + " pontos"); }else
		 * if (menor == pontosBahia) { System.out.println("Bahia");
		 * System.out.println("Com a pontuação de: " + pontosBahia + " pontos"); }else
		 * if (menor == pontosBotafogo) { System.out.println("Botafogo");
		 * System.out.println("Com a pontuação de: " + pontosBotafogo + " pontos");
		 * }else if (menor == pontosCeara) { System.out.println("Ceara");
		 * System.out.println("Com a pontuação de: " + pontosCeara + " pontos"); }else
		 * if (menor == pontosCorinthians) { System.out.println("Corinthians");
		 * System.out.println("Com a pontuação de: " + pontosCorinthians + " pontos");
		 * }else if (menor == pontosCoritiba) { System.out.println("Coritiba");
		 * System.out.println("Com a pontuação de: " + pontosCoritiba + " pontos"); }
		 * else if (menor == pontosFlamengo) { System.out.println("Flamengo");
		 * System.out.println("Com a pontuação de: " + pontosFlamengo + " pontos"); }
		 * else if (menor == pontosFluminense) { System.out.println("Fluminense");
		 * System.out.println("Com a pontuação de: " + pontosFluminense + " pontos");
		 * }else if (menor == pontosFortaleza) { System.out.println("Fortaleza");
		 * System.out.println("Com a pontuação de: " + pontosFortaleza + " pontos");
		 * }else if (menor == pontosGoias) { System.out.println("Goias");
		 * System.out.println("Com a pontuação de: " + pontosGoias + " pontos"); }else
		 * if (menor == pontosGremio) { System.out.println("Grêmio");
		 * System.out.println("Com a pontuação de: " + pontosGremio + " pontos"); }else
		 * if (menor == pontosInternacional) { System.out.println("Internacional");
		 * System.out.println("Com a pontuação de: " + pontosInternacional + " pontos");
		 * }else if (menor == pontosPalmeiras) { System.out.println("Palmeiras");
		 * System.out.println("Com a pontuação de: " + pontosPalmeiras + " pontos");
		 * }else if (menor == pontosRedbull) {
		 * System.out.println("Red Bull Bragantino");
		 * System.out.println("Com a pontuação de: " + pontosRedbull + " pontos"); }else
		 * if (menor == pontosSantos) { System.out.println("Santos");
		 * System.out.println("Com a pontuação de: " + pontosSantos + " pontos"); }else
		 * if (menor == pontosSaopaulo) { System.out.println("Sao Paulo");
		 * System.out.println("Com a pontuação de: " + pontosSaopaulo + " pontos");
		 * }else if (menor == pontosSport) { System.out.println("Sport");
		 * System.out.println("Com a pontuação de: " + pontosSport + " pontos"); }else
		 * if (menor == pontosVasco) { System.out.println("Vasco");
		 * System.out.println("Com a pontuação de: " + pontosVasco + " pontos"); }else {
		 * System.out.println("System Erro - Not Found"); }
		 */

		System.out.println("\n");

		System.out.println(" -------------------------------\n" + "| Simulação gerada com sucesso! |\n"
				+ " -------------------------------\n"
				+ "\n------------ Obrigado por utilizar o Simulador! ------------");

	}
}