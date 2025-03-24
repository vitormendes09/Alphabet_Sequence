package application;

import domain.AlphabetList;
import domain.LinkedAlphabetList;

public class AlphabetServiceImpl implements AlphabetService {

    private final AlphabetList alphabetList;

    public AlphabetServiceImpl() {
        this.alphabetList = new LinkedAlphabetList();
        populateAlphabet();
    }


    private void populateAlphabet() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabetList.add(letter);
        }
    }
    
    @Override
    public String getAlphabetSequence(int position) {
        return alphabetList.getLettersUpTo(position);
    }
}
