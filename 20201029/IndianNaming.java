import java.util.Scanner;
public class IndianNaming{
	Scanner sc = new Scanner(System.in);
	String[] year = {"시끄러운, 말 많은","푸른","어두운","조용한","웅크린","백색","지혜로운","용감한","날카로운","욕심 많은"};
	String[] month = {"늑대","태양","양","매","황소","불꽃","나무","달빛","말","돼지","하늘","바람"};
	String[] day ={"와(과) 함께 춤을","의 기상","은(는) 그림자 속에","","","","의 환생","의 죽음","아래에서","을(를) 보라.","이(가) 노래하다.",
				"의 그늘","의 일격","에게 쫒기는 남자","의 행진","의 왕","의 유령","을 죽인 자","은(는) 맨날 잠잔다","처럼","의 고향","의 전사",
				"은(는) 나의 친구","의 노래","의 정령","의 파수꾼","의 악마","와(과) 같은 사나이","의 심판자","의 혼","은(는) 말이 없다."};
	
	public void run(){
		System.out.print("생년월일을 입력하세요 : ");
		String str = sc.next();
		String y =str.substring(3,4);
		String m =str.substring(4,6);
		String d =str.substring(6,8);
		if(m.substring(0,1)=="0"){
			m = m.substring(1);
		}
		y = year[Integer.parseInt(y)-1];
		m = month[Integer.parseInt(m)-1];
		d = day[Integer.parseInt(d)-1];
		System.out.println(y+" "+m+d);
	}
	public static void main(String args[]){
		IndianNaming naming = new IndianNaming();
		naming.run();
	}
}
/*
◇ 자신의 생월

◇ 자신의 생일
1일:~와(과) 함께 춤을2일:~의 기상3일:~은(는) 그림자 속에4일:따로 붙는 말이 없음5일:따로 붙는 말이 없음
6일:따로 붙는 말이 없음7일:~의 환생8일:~의 죽음9일:~아래에서10일:~을(를) 보라.
11일:~이(가) 노래하다.12일:~의 그늘 → 그림자13일:~의 일격14일:~에게 쫒기는 남자15일:~의 행진
16일:~의 왕17일:~의 유령18일:~을 죽인 자.19일:~은(는) 맨날 잠잔다.20일:~처럼..
21일:~의 고향
22일:~의 전사
23일:~은(는) 나의 친구
24일:~의 노래
25일:~의 정령
26일:~의 파수꾼
27일:~의 악마
28일:~와(과) 같은 사나이
29일:~의 심판자→을(를) 쓰러뜨린 자
30일:~의 혼
31일:~은(는) 말이 없다.
1월:늑대
2월:태양
3월:양
4월:매
5월:황소
6월:불꽃
7월:나무
8월:달빛
9월:말
10월:돼지
11월:하늘
12월:바람
◇ 태어난 년도 뒷자리
***0년생:시끄러운, 말 많은
***1년생:푸른
***2년생:어두운 →적색
***3년생:조용한
***4년생:웅크린
***5년생:백색
***6년생:지혜로운
***7년생:용감한
***8년생:날카로운
***9년생:욕심 많은



*/