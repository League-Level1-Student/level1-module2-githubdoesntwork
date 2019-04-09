package tea_party;

public class TeaParty {

    public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
    	if (isKnighted&&isWoman) {
			return "Hello Lady "+name+"";
		}else if (isKnighted&&!isWoman) {
			return "Hello Sir "+name+"";
		}else if (!isKnighted&&!isWoman) {
			return "Hello Mr. "+name+"";
		}else {
			return "Hello Ms. "+name+"";
		}

    }

}
