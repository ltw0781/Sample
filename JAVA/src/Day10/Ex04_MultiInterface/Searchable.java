package Day10.Ex04_MultiInterface;

public interface Searchable {
	
	
	//채널 검색
	// 검색어에 해당하는 채널번호 반환
	int chennelSearch(String keyword);
	
	// 컨텐츠에 검색
	// : 검색어에 해당하는 컨텐츠응 반환
	
	String[] contentSearch(String keyword);
	
	

}
