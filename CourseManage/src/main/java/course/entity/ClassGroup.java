package course.entity;

public class ClassGroup {
	private User leader;
	private User members;
	public ClassGroup() {
		
	}
	public ClassGroup(User leader,User members) {
		this.leader=leader;
		this.members=members;
	}
	public User getLeader() {
		return leader;
	}
	public void setLeader(User leader) {
		this.leader = leader;
	}
	public User getMembers() {
		return members;
	}
	public void setMembers(User members) {
		this.members = members;
	}
}
