package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Greedy Algorithm
// https://www.acmicpc.net/problem/13305

public class GasStation_13305 {
	
	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nOfCity = Integer.parseInt(br.readLine());

		// 각 도시간의 거리
		long[] distance = new long[nOfCity-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<nOfCity-1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		// 각 도시의 주유소 비용
		long[] cost = new long[nOfCity];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<nOfCity; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
			
		// Solve : 최소비용 -> 가격이 제일 낮은 주유소에서 최대한 많은 기름을 주유해야..
		// #1. 나중에 방문할 도시중 현재 도시보다 기름값이 저렴한 도시가 있는가?
		// #2. 있다면, 해당 도시까지 가는데 필요한 기름만 주유
		// #3. 없다면, 현재위치에서 목적지까지 필요한 기름 주유
		long minCost = distance[0] * cost[0];	// 최소 비용
		int nowCity = 0;			// 현재 도시 Index
		int nextCity = nowCity + 1;	// 다음 도시 Index
		
		while (nextCity < nOfCity - 1) {	// 마지막 도시 바로 전까지 반복
			if (cost[nowCity] < cost[nextCity]) {
				minCost += cost[nowCity] * distance[nextCity];
			}
			else {
				minCost += cost[nextCity] * distance[nextCity];
				nowCity = nextCity;
			}
			nextCity++;
		}
		System.out.println(minCost);
	}
	
}
