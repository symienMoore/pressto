package org.lightwave;
import org.lightwave.compressor.FileCompressor;

public class Main {
    public static void main(String[] args) {
        FileCompressor compressor = new FileCompressor();
        compressor.compress();
    }
}