/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author M S I
 */
public class InsertTodoDTO {
    private String title;
    private String status;
    
    public InsertTodoDTO(
        String title,
        String status
    ) {
        this.title = title;
        this.status = status;
    } 
    
    public String getTitle() {
        return this.title;
    }
    
    public String getStatus() {
        return this.status;
    }
}
