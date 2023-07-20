
import java.time.LocalDate;

/**
 *
 */
public class Note {

    public String data;
    public LocalDate currentDate;

    /**
     *
     */
    public Note(){
        this.data = Input.inPut();
        this.currentDate = LocalDate.now();
    }

    /**
     * @param data
     */
    public Note(String data){
        this.data = Input.inPut();
        this.currentDate = LocalDate.now();
    }

    /**
     * @return
     */
    public String transform(){
        return this.data +  "-> " + this.currentDate;
    }

}
