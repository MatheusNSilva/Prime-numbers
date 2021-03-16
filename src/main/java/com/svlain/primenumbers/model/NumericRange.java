package com.svlain.primenumbers.model;

import java.util.ArrayList;
import java.util.List;

public class NumericRange {

	private Long id;
    private int firstValue;
    private int lastValue;


    public NumericRange(int firstValue, int lastValue) {
        this.firstValue = firstValue;
        this.lastValue = lastValue;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
        NumericRange other = (NumericRange) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	public int getLastValue() {
		return lastValue;
	}

	public void setLastValue(int lastValue) {
		this.lastValue = lastValue;
    }
    
    public List<Integer> rangeList(int firstValue, int lastValue) {
        List<Integer> primesBetween = new ArrayList<>();
        int possiblePrimeNumber, dividers, prime;
        for (possiblePrimeNumber = firstValue; possiblePrimeNumber <= lastValue; possiblePrimeNumber++)
        {
            prime = 0;
            for (dividers = 1; dividers <= possiblePrimeNumber; dividers++) {// Laço para contar as divisões exatas
                if ((possiblePrimeNumber % dividers) == 0)
                    prime++;
            }
            if (prime == 2) {
                primesBetween.add(possiblePrimeNumber);
            }
        }
        return primesBetween;
    }

}