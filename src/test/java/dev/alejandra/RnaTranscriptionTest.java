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

}
