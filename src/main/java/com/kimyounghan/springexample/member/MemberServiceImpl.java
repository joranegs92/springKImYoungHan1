package com.kimyounghan.springexample.member;

public class MemberServiceImpl implements MemberService{

	//구현체에 구체화를 시켜줌 현재는 memoryMemberRepository정책을 실행함.
	private final MemberRepository memberRepository;

	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}
}
