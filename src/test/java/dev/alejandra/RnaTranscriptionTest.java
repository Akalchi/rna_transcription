package dev.alejandra;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription = new RnaTranscription();

    @Test
    public void testEmptyRnaSequence() {
        assertThat(rnaTranscription.toRna(""), is(""));
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
    assertThat(rnaTranscription.toRna("C"), is("G"));
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
    assertThat(rnaTranscription.toRna("G"), is("C"));
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
    assertThat(rnaTranscription.toRna("T"), is("A"));
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
    assertThat(rnaTranscription.toRna("A"), is("U"));
    }

}
