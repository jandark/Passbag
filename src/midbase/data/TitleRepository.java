package midbase.data;

import midbase.domain.Title;

public class TitleRepository {

	Title[] titles;
	
	// TODO PersistableManager alacak sekilde (EntryRepo daki gibi) degistirlecek ve alttakitanimlar dinamik olacak
	
	public TitleRepository(){
		this.titles = new Title[4];
		
		titles[0] = new Title("Kullan�c� Ad�");
		titles[1] = new Title("�ifre");
		titles[2] = new Title("Parola");
		titles[3] = new Title("M��teri No");
	}
	
	public Title[] GetFieldTitles(){
						
		return this.titles;
	}
	
	public Title getFieldTitle(int id){
		return this.titles[id];
	}
	
}
