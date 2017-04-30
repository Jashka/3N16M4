package enigma.rotor;

import java.io.*;

public abstract class Rotor {
    private static final int AlphabetLength = 27;

    protected char [] rotor = new char[AlphabetLength];

    protected int turns = 0;

    public int indexOf(char c) {
    for(int i = 0; i < AlphabetLength; i++){
            if(rotor[i] == c)
            return i;
    }

    return -1;
    }

    public int turns()
    {return turns;}

    public void turn() {
    char c = rotor[0];
    for(int i = 1; i < AlphabetLength;i++){
            rotor[i-1] = rotor[i];
    }

    rotor[AlphabetLength-1] = c;

    turns++;
    }

    public char charAt(int i)
    {
    return rotor[i];
    }

    public Rotor(){
    turns = 0;
    setAlphabet();
    }

    public abstract void setAlphabet();
}
