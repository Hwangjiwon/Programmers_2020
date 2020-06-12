package programmers_42579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Song {
	String genres;
	int plays;

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public int getPlays() {
		return plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}

	Song(String genres, int plays) {
		this.genres = genres;
		this.plays = plays;
	}
}

public class Main {
	/*
	 * 베스트 앨범
	 * 
	 * 장르별로 가장 많이 재생된 노래를 두개씩 모아 앨범출시 속한 노래가 가장 많이 재생된 장르를 먼저 수록 장르 내에서 많이 재생된
	 * 노래를 먼저 수록
	 * 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] gen = { "classic", "pop", "classic", "classic", "pop" };
		int[] pla = { 500, 600, 150, 800, 2500 };

		solution(gen, pla);

		br.close();
	}

	public static void solution(String[] genres, int[] plays) {
		int[] answer = {};
		HashMap<Integer, Song> album = new HashMap<>();
		HashMap<String, Integer> genreCnt = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			album.put(i, new Song(genres[i], plays[i]));

			if (!genreCnt.containsKey(genres[i])) {
				genreCnt.put(genres[i], plays[i]);
			} else {
				genreCnt.put(genres[i], genreCnt.get(genres[i]) + plays[i]);
			}
		}

		List<Integer> list = new ArrayList<>(album.keySet());

		for (int i : list) {
			System.out.print(i + ":" + album.get(i).genres + "==");
			System.out.println(album.get(i).plays);
		}

		System.out.println("************");
		Collections.sort(list, (o1, o2) -> (new Integer(album.get(o2).plays).compareTo((album.get(o1).plays))));

		for (int i : list) {
			System.out.print(i + ":" + album.get(i).genres + "==");
			System.out.println(album.get(i).plays);
		}

		System.out.println("************");

		Collections.sort(list, (o1, o2) -> (album.get(o1)).genres.compareTo((album.get(o2)).genres));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int i : list) {
			System.out.print(i + ":" + album.get(i).genres + "==");
			System.out.println(album.get(i).plays);
		}

		System.out.println("************");

		List<String> genSort = new ArrayList<>(genreCnt.keySet());
		Collections.sort(genSort, (o1, o2) -> (genreCnt.get(o2).compareTo(genreCnt.get(o1))));

		for (String i : genSort) {
			System.out.print(i + "==");
			System.out.println(genreCnt.get(i));
		}

		// List<Song> playList = new LinkedList<>();
		for (int i = 0; i < genSort.size(); i++) {
			String gen = genSort.get(i);
			System.out.println(gen);

			for (int j = 0; j < list.size(); j++) {
				if (album.get(j).genres.equals(gen)) {
					System.out.println(j);
				}
			}
		}

		// return answer;
	}
}
