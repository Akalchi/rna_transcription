package dev.alejandra;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testRnaTranscription() {
    assertThat(rnaTranscription.toRna("ACGTGGTCTTAA"), is("UGCACCAGAAUU"));
    }

    @Test
    public void testInvalidInputRnaSequence() {
    assertThrows(IllegalArgumentException.class, () -> {
        rnaTranscription.toRna("XYZ");
    });
}

}
