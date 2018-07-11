/* MIT License
 *
 * Copyright (c) 2017 Mateusz Pawlik
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package at.unisalzburg.dbresearch.apted.node;

import java.util.regex.Pattern;

/**
 * Represents a node label that consists of a single string value. Such label
 * belongs to a node.
 *
 * @see Node
 */
public class StringNodeData {

  /**
   * The label of a node.
   */
  private String label;
  private int order;
  private int index;
  private float scalar;
  private float birth;
  private float death;
  private float persistence;

  /**
   * Constructs node data with a specified label.
   *
   * @param label string label of a node.
   */
  public StringNodeData(String label) {
    String[] labels = label.split(Pattern.quote("|"));
    
    this.order = Integer.parseInt(labels[0]);
    this.index = Integer.parseInt(labels[1]);
    this.scalar = Float.parseFloat(labels[2]);
    this.birth = Float.parseFloat(labels[3]);
    this.death = Float.parseFloat(labels[4]);
    this.persistence = this.death - this.birth;
    
    this.label = label;
    
  }

  /**
   * Returns the label of a node.
   *
   * @return node label.
   */
  public String getLabel() {
    return label;
  }
  
  public int getOrder(){
      return order;
  }
  
  public int getIndex(){
      return index;
  }
  
  public float getScalar(){
      return scalar;
  }
  
  public float getBirth(){
      return birth;
  }
  
  public float getDeath(){
      return death;
  }
  
  public float getPersistence(){
      return persistence;
  }
  
}
