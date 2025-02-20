package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer extends Device implements EntertainmentDevices {
    private double currentVolume;
    private List<String> playlist;
    private int currentSongIndex;
    private Scanner sc;

    public MusicPlayer() {
        this.playlist = new ArrayList<>();
        this.currentSongIndex = 0;
        this.sc = new Scanner(System.in);

        // Adding sample songs
        playlist.add("Shape of You");
        playlist.add("Blinding Lights");
        playlist.add("Believer");
        playlist.add("Senorita");
        playlist.add("Someone Like You");
        playlist.add("Cheap Thrills");
        playlist.add("Perfect");
        playlist.add("Memories");
        playlist.add("Photograph");
        playlist.add("Levitating");
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = Math.max(0, Math.min(100, currentVolume)); // Ensuring volume stays between 0 and 100
    }

    public void volumeIncrease() {
        if (powerStatus) {
            System.out.println("Increase volume up to:");
            double volume = sc.nextDouble();
            if (volume > currentVolume && volume <= 100) {
                setCurrentVolume(volume);
                System.out.println("Volume set to: " + currentVolume);
            } else {
                System.out.println("Invalid volume level.");
            }
        } else {
            System.out.println("Music Player is OFF.");
        }
    }

    public void volumeDecrease() {
        if (powerStatus) {
            System.out.println("Decrease volume down to:");
            double volume = sc.nextDouble();
            if (volume < currentVolume && volume >= 0) {
                setCurrentVolume(volume);
                System.out.println("Volume set to: " + currentVolume);
            } else {
                System.out.println("Invalid volume level.");
            }
        } else {
            System.out.println("Music Player is OFF.");
        }
    }

    public void changeSong() {
        if (!powerStatus) {
            System.out.println("Music Player is OFF.");
            return;
        }

        while (true) {
            System.out.println("Change Song By: \n1. Forward Song \n2. Reverse Song \n3. Go to Specific Song \n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (currentSongIndex < playlist.size() - 1) {
                        currentSongIndex++;
                    } else {
                        System.out.println("Already at the last song.");
                    }
                    System.out.println("Now Playing: " + playlist.get(currentSongIndex));
                    break;
                case 2:
                    if (currentSongIndex > 0) {
                        currentSongIndex--;
                    } else {
                        System.out.println("Already at the first song.");
                    }
                    System.out.println("Now Playing: " + playlist.get(currentSongIndex));
                    break;
                case 3:
                    System.out.println("Enter the song number (1 to " + playlist.size() + "):");
                    int songNumber = sc.nextInt();
                    if (songNumber >= 1 && songNumber <= playlist.size()) {
                        currentSongIndex = songNumber - 1;
                        System.out.println("Now Playing: " + playlist.get(currentSongIndex));
                    } else {
                        System.out.println("Invalid song number!");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

	


