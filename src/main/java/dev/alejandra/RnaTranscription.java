package dev.alejandra;

public class RnaTranscription {

    public String toRna(String dnaStrand) {
        if (dnaStrand.isEmpty()) {
            return "";
        }
        
        StringBuilder rnaStrand = new StringBuilder();
        
        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaStrand.append('C');
                    break;
                case 'C':
                    rnaStrand.append('G');
                    break;
                case 'T':
                    rnaStrand.append('A');
                    break;
                case 'A':
                    rnaStrand.append('U');
                    break;
                default:
                    break;
            }
        }
        
        return rnaStrand.toString();
    }
}
