package ingsw.pdd.Observer.impl;

public interface IObserver {
	public void notifyObserver(String command, Object source);
}