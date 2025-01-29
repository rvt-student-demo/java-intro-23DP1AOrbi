package lv.rvt.secondSem;

public class Engine extends Part {

    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        // Izsauc Part klases konstruktoru
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

     // izsakt šīs klases konstrukor -> this();

     // protecteed ir neredzams priekš visām klasēm
     // protected void exampleMethod() {
     // }

     // izņemot sub klases jeb child klases
    public String getEngineType() {
        return engineType;
    }
}