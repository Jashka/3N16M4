package enigma.rotor;

import enigma.rotor.Rotor;

public class LargeRotor extends Rotor{
    @Override
    public void setAlphabet()
    {
    int  i = 0;

        rotor[i] = ' ';
        i++;

        rotor[i] = 'B';
        i++;

        rotor[i] = 'D';
        i++;

        rotor[i] = 'F';
        i++;

        rotor[i] = 'H';
        i++;

        rotor[i] = 'J';
        i++;

        rotor[i] = 'L';
        i++;

        rotor[i] = 'N';
        i++;

        rotor[i] = 'P';
        i++;

        rotor[i] = 'R';
        i++;

        rotor[i] = 'T';
        i++;

        rotor[i] = 'V';
        i++;

        rotor[i] = 'X';
        i++;

        rotor[i] = 'Z';
        i++;

        rotor[i] = 'A';
        i++;

        rotor[i] = 'C';
        i++;

        rotor[i] = 'E';
        i++;

        rotor[i] = 'G';
        i++;

        rotor[i] = 'I';
        i++;

        rotor[i] = 'K';
        i++;

        rotor[i] = 'M';
        i++;

        rotor[i] = 'O';
        i++;

        rotor[i] = 'Q';
        i++;

        rotor[i] = 'S';
        i++;

        rotor[i] = 'U';
        i++;

        rotor[i] = 'W';
        i++;

        rotor[i] = 'Y';

    System.out.println("Finished Initialising Large Rotor  i="+i);
    }
}
