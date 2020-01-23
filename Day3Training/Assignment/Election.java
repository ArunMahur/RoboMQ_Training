package com.robomq.Day3Training.Assignment;

public class Election {

	private int E_id;
	private String name,electiondate,district,constituency,countingdate;
	public int getE_id() {
		return E_id;
	}

	
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getCountingdate() {
		return countingdate;
	}
	public void setCountingdate(String countingdate) {
		this.countingdate = countingdate;
	}
	@Override
	public String toString() {
		return "\n Election [E_id=" + E_id + ", name=" + name + ", electiondate=" + electiondate + ", district=" + district
				+ ", constituency=" + constituency + ", countingdate=" + countingdate + "]";
	}
	public Election(int e_id, String name, String electiondate, String district, String constituency,
			String countingdate) {
		super();
		E_id = e_id;
		this.name = name;
		this.electiondate = electiondate;
		this.district = district;
		this.constituency = constituency;
		this.countingdate = countingdate;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Election other = (Election) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
