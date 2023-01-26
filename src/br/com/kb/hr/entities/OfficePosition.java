package br.com.kb.hr.entities;

public enum OfficePosition {

	ASSISTANT {
		@Override
		public OfficePosition getNextPosition() {
			return ANALYST;
		}
	},
	ANALYST {
		@Override
		public OfficePosition getNextPosition() {
			return SPECIALIST;
		}
	},
	SPECIALIST {
		@Override
		public OfficePosition getNextPosition() {
			return MANAGER;
		}
	},
	MANAGER {
		@Override
		public OfficePosition getNextPosition() {
			return MANAGER;
		}
	};

	public abstract OfficePosition getNextPosition();

}
