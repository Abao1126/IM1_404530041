/*
 * [A]90
 * [TA's Advise]
 * 1.�ѧ�, �A��folder�W�٭n�g�n�g����!
 * 2.�t��k�����@�n�T��.
 * 3.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 4.�å�����javadoc, ��������5��.
 * */
public class eastertester {
	public static void main(String[] args) {
		String easter2001 = easter.calculateEaster(2001);
		String easter2012 = easter.calculateEaster(2012);

		// �걵�r�ꪺ�u�@�i�H�d���l�{���h��, �D�{���u�ݭn�L�X�N�n�F, �o�˷|���|����n�O?

		System.out.println("In 2001, Easter Sunday is:" + easter2001);
		System.out.println("In 2012, Easter Sunday is:" + easter2012);

	}
}
