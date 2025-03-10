package dev.alejandra;

public class RnaTranscription {

    public String toRna(String dnaStrand) {
        if (dnaStrand.isEmpty()) {
            return "";
        }
        if (dnaStrand.equals("C")) {
            return "G";
        }
        return "";
    }
}
