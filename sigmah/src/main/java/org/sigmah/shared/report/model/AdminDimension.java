/*
 * All Sigmah code is released under the GNU General Public License v3
 * See COPYRIGHT.txt and LICENSE.txt.
 */

package org.sigmah.shared.report.model;

public class AdminDimension extends Dimension {


	private int levelId;

    private AdminDimension() {

    }

	public AdminDimension(int levelId) {
		super(DimensionType.AdminLevel);

		this.levelId = levelId;

    }

	public int getLevelId() {
		return this.levelId;
	}

    private void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    @Override
	public boolean equals(Object other) {
		if(this==other) {
            return true;
        }
		if(other==null) {
            return false;
        }
		if(!(other instanceof AdminDimension)) {
            return false;
        }


		AdminDimension that = (AdminDimension)other;


		return this.levelId == that.levelId;

	}


}