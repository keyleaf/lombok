import java.util.List;
class BuilderSimpleWithSetterPrefix<T> {
	private int unprefixed;
	@java.lang.SuppressWarnings("all")
	BuilderSimpleWithSetterPrefix(final int unprefixed) {
		this.unprefixed = unprefixed;
	}
	@java.lang.SuppressWarnings("all")
	protected static class BuilderSimpleWithSetterPrefixBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private int unprefixed;
		@java.lang.SuppressWarnings("all")
		BuilderSimpleWithSetterPrefixBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSimpleWithSetterPrefixBuilder<T> withUnprefixed(final int unprefixed) {
			this.unprefixed = unprefixed;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSimpleWithSetterPrefix<T> build() {
			return new BuilderSimpleWithSetterPrefix<T>(unprefixed);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderSimpleWithSetterPrefix.BuilderSimpleWithSetterPrefixBuilder(unprefixed=" + this.unprefixed + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	protected static <T> BuilderSimpleWithSetterPrefixBuilder<T> builder() {
		return new BuilderSimpleWithSetterPrefixBuilder<T>();
	}
}
