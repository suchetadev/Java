package composition;

public class PaperTray {

	int pages = 0;
	
	public void addPaper(int count){
		pages = pages + count;
	}
	
	public void usePaper(){
		
		pages--;
	}
	
	public boolean isEmpty(){
	
		if(pages == 0){
			return true;
		}
		else
			return false;
	}
	
}
