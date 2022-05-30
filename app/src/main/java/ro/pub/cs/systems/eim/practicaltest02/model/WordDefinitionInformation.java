package ro.pub.cs.systems.eim.practicaltest02.model;

public class WordDefinitionInformation {
    String definition;

    public WordDefinitionInformation(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "WordDefinitionInformation{" +
                "definition='" + definition + '\'' +
                '}';
    }
}
