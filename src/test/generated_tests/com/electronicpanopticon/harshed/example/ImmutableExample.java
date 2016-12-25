package com.electronicpanopticon.harshed.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Example}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExample.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Example"})
public final class ImmutableExample extends Example {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final double height;
  private final double weight;

  private ImmutableExample(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @Override
  public String firstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @Override
  public String lastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @Override
  public int age() {
    return age;
  }

  /**
   * @return The value of the {@code height} attribute
   */
  @Override
  public double height() {
    return height;
  }

  /**
   * @return The value of the {@code weight} attribute
   */
  @Override
  public double weight() {
    return weight;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#firstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withFirstName(String value) {
    if (this.firstName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "firstName");
    return new ImmutableExample(newValue, this.lastName, this.age, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#lastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withLastName(String value) {
    if (this.lastName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastName");
    return new ImmutableExample(this.firstName, newValue, this.age, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#age() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withAge(int value) {
    if (this.age == value) return this;
    return new ImmutableExample(this.firstName, this.lastName, value, this.height, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#height() height} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for height
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withHeight(double value) {
    if (Double.doubleToLongBits(this.height) == Double.doubleToLongBits(value)) return this;
    return new ImmutableExample(this.firstName, this.lastName, this.age, value, this.weight);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Example#weight() weight} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for weight
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExample withWeight(double value) {
    if (Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(value)) return this;
    return new ImmutableExample(this.firstName, this.lastName, this.age, this.height, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExample
        && equalTo((ImmutableExample) another);
  }

  private boolean equalTo(ImmutableExample another) {
    return firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && age == another.age
        && Double.doubleToLongBits(height) == Double.doubleToLongBits(another.height)
        && Double.doubleToLongBits(weight) == Double.doubleToLongBits(another.weight);
  }

  /**
   * Computes a hash code from attributes: {@code firstName}, {@code lastName}, {@code age}, {@code height}, {@code weight}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + firstName.hashCode();
    h = h * 17 + lastName.hashCode();
    h = h * 17 + age;
    h = h * 17 + Double.hashCode(height);
    h = h * 17 + Double.hashCode(weight);
    return h;
  }

  /**
   * Prints the immutable value {@code Example} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Example{"
        + "firstName=" + firstName
        + ", lastName=" + lastName
        + ", age=" + age
        + ", height=" + height
        + ", weight=" + weight
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Example} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Example instance
   */
  public static ImmutableExample copyOf(Example instance) {
    if (instance instanceof ImmutableExample) {
      return (ImmutableExample) instance;
    }
    return ImmutableExample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableExample ImmutableExample}.
   * @return A new ImmutableExample builder
   */
  public static ImmutableExample.Builder builder() {
    return new ImmutableExample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableExample ImmutableExample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private static final long INIT_BIT_AGE = 0x4L;
    private static final long INIT_BIT_HEIGHT = 0x8L;
    private static final long INIT_BIT_WEIGHT = 0x10L;
    private long initBits = 0x1fL;

    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Example} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Example instance) {
      Objects.requireNonNull(instance, "instance");
      firstName(instance.firstName());
      lastName(instance.lastName());
      age(instance.age());
      height(instance.height());
      weight(instance.weight());
      return this;
    }

    /**
     * Initializes the value for the {@link Example#firstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#lastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#age() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(int age) {
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#height() height} attribute.
     * @param height The value for height 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder height(double height) {
      this.height = height;
      initBits &= ~INIT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the value for the {@link Example#weight() weight} attribute.
     * @param weight The value for weight 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder weight(double weight) {
      this.weight = weight;
      initBits &= ~INIT_BIT_WEIGHT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableExample ImmutableExample}.
     * @return An immutable instance of Example
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableExample build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableExample(firstName, lastName, age, height, weight);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      if ((initBits & INIT_BIT_HEIGHT) != 0) attributes.add("height");
      if ((initBits & INIT_BIT_WEIGHT) != 0) attributes.add("weight");
      return "Cannot build Example, some of required attributes are not set " + attributes;
    }
  }
}
