package course.entity;

public class Group {
	private String id;
	private User leader;
	private User members;
	private Topic topics;
	public Group() {
		
	}
	public Group(String id,User leader,User members,Topic topics) {
		this.id=id;
		this.leader=leader;
		this.members=members;
		this.topics=topics;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Topic getTopics() {
		return topics;
	}
	public void setTopics(Topic topics) {
		this.topics = topics;
	}
	
}
