package org.openjfx;

import java.util.LinkedList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This function is in charge of displaying the original form for the user.
 * @author Wills Jarquin.
 */
public class ReviewObject  extends Application{
	
	BusinessObject bo = new BusinessObject();
	
	/**
	 * This method shows a screen.
	 * @param bo is the bo to rendered.
	 */
	public void showScreen(BusinessObject bo) {
		this.bo = bo;
		launch();
	}
	
	/**
	 * This function initializes the sub-system.
	 * @param args are console parameters.
	 */
	@Override
	public void start(Stage arg0) throws Exception {	
		
		arg0.setTitle("Worker Petition Form");
		arg0.show();
	}
	
	/**
	 * * This method grabs a stage and the objects and renders into the screen.
	 * @param boListToReview is the list of BOs to review.
	 * @param boListToApprove is the list of BOs to approve.
	 * @param stage is the stage to be rendered.
	 * @return the scene to render.
	 */
	public Scene getScene(LinkedList<BusinessObject> boListToReview, LinkedList<BusinessObject> boListToApprove, Stage stage) {
		this.bo = boListToReview.getFirst();
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(grid, 700, 800);
		
		Text sceneTitle = new Text("Review Worker Petition");
		sceneTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 20));
		grid.add(sceneTitle, 0, 0, 2, 1);
		
		Line line0 = new Line();
		line0.setStartX(100);
		line0.setStartY(100);
		line0.setEndX(500);
		line0.setEndY(100);
		grid.add(line0, 0, 1);
		
		Text subTitle_1 = new Text("Petitioner's Info");
		subTitle_1.setFont(Font.font(STYLESHEET_CASPIAN, 18));
		grid.add(subTitle_1, 0, 2);
		
		Label pFirstNameLabel = new Label("First Name: ");
		pFirstNameLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(pFirstNameLabel, 0, 3);
		Text pFirstName = new Text(this.bo.getPetitionerFirstName());
		pFirstName.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(pFirstName, 1, 3);
		
		Label pLastNameLabel = new Label("Last Name: ");
		pLastNameLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(pLastNameLabel, 0, 4);
		Text pLastName = new Text(this.bo.getPetitionerLastName());
		pLastName.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(pLastName, 1, 4);
		
		Label companyNameLabel = new Label("Company Name: ");
		companyNameLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(companyNameLabel, 0, 5);
		Text companyName = new Text(this.bo.getBusinessName());
		companyName.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(companyName, 1, 5);
		
		Label pAddressLabel = new Label("Address:  ");
		pAddressLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(pAddressLabel, 0, 6);
		Text pAddress = new Text(this.bo.getAddress());
		pAddress.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(pAddress, 1, 6);
		
		
		Label pPhoneNumberLabel = new Label("Phone Number: ");
		pPhoneNumberLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(pPhoneNumberLabel, 0, 7);
		Text pPhoneNumber = new Text(this.bo.getPhoneNumber());
		pPhoneNumber.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(pPhoneNumber, 1, 7);
		
		
		Label pEmailLabel = new Label("Last Name: ");
		pEmailLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(pEmailLabel, 0, 8);
		Text pEmail = new Text(this.bo.getEmail());
		pEmail.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(pEmail, 1, 8);
		
		Label einSsnLabel = new Label("EIN/ITIN/SSN: ");
		einSsnLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(einSsnLabel, 0, 9);
		Text einSsn= new Text(this.bo.getEIN());
		einSsn.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(einSsn, 1, 9);	
		
		Line line1 = new Line();
		line1.setStartX(100);
		line1.setStartY(100);
		line1.setEndX(500);
		line1.setEndY(100);
		grid.add(line1, 0, 10);
		
		
		/**
		 * Beneficiary's fields
		 */
		
		Text subTitle_2 = new Text("Beneficiary's Info");
		subTitle_2.setFont(Font.font(STYLESHEET_CASPIAN, 18));
		grid.add(subTitle_2, 0, 11, 2, 1);
		
		Label bFirstNameLabel = new Label("First Name: ");
		bFirstNameLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(bFirstNameLabel, 0, 12);
		Text bFirstName = new Text(this.bo.getBeneficiaryFirstName());
		bFirstName.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(bFirstName, 1, 12);
		
		Label bLastNameLabel = new Label("Last Name: ");
		bLastNameLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(bLastNameLabel, 0, 13);
		Text bLastName = new Text(this.bo.getBeneficiaryLastName());
		bLastName.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(bLastName, 1, 13);
		
		Label dobLabel = new Label("Date Of Birth: ");
		dobLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(dobLabel, 0, 14);
		Text dob = new Text(this.bo.getBeneficiaryDOB());
		dob.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(dob, 1, 14);
		
		Label genderLabel = new Label("Gender:  ");
		genderLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(genderLabel, 0, 15);
		Text gender = new Text(this.bo.getBeneficiaryGender());
		gender.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(gender, 1, 15);
		
		
		Label originLabel = new Label("Country Of Origin: ");
		originLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(originLabel, 0, 16);
		Text origin= new Text(this.bo.getBeneficiaryCountryOfBirth());
		origin.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(origin, 1, 16);
		
		
		Label bAddressLabel = new Label("Address: ");
		bAddressLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(bAddressLabel, 0, 17);
		Text bAddress = new Text(this.bo.getBeneficiaryAddress());
		bAddress.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(bAddress, 1, 17);
		
		Label passportExpirationDateLabel = new Label("Passport Expiration Date: ");
		passportExpirationDateLabel.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 14));
		grid.add(passportExpirationDateLabel, 0, 18);
		Text passportExpirationDate= new Text(this.bo.getBeneficiaryPassportExpirationDate());
		passportExpirationDate.setFont(Font.font(STYLESHEET_CASPIAN, 14));
		grid.add(passportExpirationDate, 1, 18);
		
		Line line2 = new Line();
		line2.setStartX(100);
		line2.setStartY(100);
		line2.setEndX(500);
		line2.setEndY(100);
		grid.add(line2, 0, 19);
		
		Button confirmButton = new Button();
		confirmButton.setText("Confirm");
		confirmButton.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 18));
		confirmButton.setStyle("-fx-background-color: #6dbf84");
		confirmButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				boolean pass = true;
				BusinessObject bo = new BusinessObject();
				bo.setPetitionerFirstName(pFirstName.getText());
				bo.setPetitionerLastName(pLastName.getText());
				bo.setBusinessName(companyName.getText());
				bo.setAddress(pAddress.getText());
				bo.setPhoneNumber(pPhoneNumber.getText());
				bo.setEmail(pEmail.getText());
				bo.setEIN(einSsn.getText());
				bo.setBeneficiaryFirstName(bFirstName.getText());
				bo.setBeneficiaryLastName(bLastName.getText());
				bo.setBeneficiaryDOB(""+dob.getText());
				bo.setBeneficiaryGender(gender.getText());;
				bo.setBeneficiaryCountryOfBirth(origin.getText());
				bo.setBeneficiaryAddress(bAddress.getText());
				bo.setBeneficiaryPassportExpirationDate(""+passportExpirationDate.getText());
				boListToApprove.add(bo);
				boListToReview.pop();
				if(boListToReview.size() <= 0) {
					WorkFlowObject wf = new WorkFlowObject();
					stage.setScene(wf.getScene(stage, boListToReview, boListToApprove));
				}
				else {
					ReviewObject re = new ReviewObject();
					stage.setScene(re.getScene(boListToReview, boListToApprove, stage));
				}
			}
		});
		grid.add(confirmButton, 0, 20);
		
		Button rejectButton = new Button();
		rejectButton.setText("Edit Request");
		rejectButton.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 18));
		rejectButton.setStyle("-fx-background-color: #db7280");
		rejectButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				boolean pass = true;
				BusinessObject bo = new BusinessObject();
				bo.setPetitionerFirstName(pFirstName.getText());
				bo.setPetitionerLastName(pLastName.getText());
				bo.setBusinessName(companyName.getText());
				bo.setAddress(pAddress.getText());
				bo.setPhoneNumber(pPhoneNumber.getText());
				bo.setEmail(pEmail.getText());
				bo.setEIN(einSsn.getText());
				bo.setBeneficiaryFirstName(bFirstName.getText());
				bo.setBeneficiaryLastName(bLastName.getText());
				bo.setBeneficiaryDOB(""+dob.getText());
				bo.setBeneficiaryGender(gender.getText());;
				bo.setBeneficiaryCountryOfBirth(origin.getText());
				bo.setBeneficiaryAddress(bAddress.getText());
				bo.setBeneficiaryPassportExpirationDate(""+passportExpirationDate.getText());
				DataEntryObject de = new DataEntryObject();
				stage.setScene(de.getScene(boListToReview, boListToApprove, stage, true));
			}
		});
		grid.add(rejectButton, 1, 20);
		
		Button goBackButton = new Button();
		goBackButton.setText("Main Menu");
		goBackButton.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 18));
		goBackButton.setStyle("-fx-background-color: #afb839");
		goBackButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				WorkFlowObject wf = new WorkFlowObject();
				stage.setScene(wf.getScene(stage, boListToReview, boListToApprove));
			}
		});
		grid.add(goBackButton, 2, 20);
		
		Button previousButton = new Button();
		previousButton.setText("Previous Request");
		previousButton.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 18));
		previousButton.setStyle("-fx-background-color: #00bdd6");
		previousButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				boListToReview.addFirst(boListToReview.removeLast());
				ReviewObject re = new ReviewObject();
				stage.setScene(re.getScene(boListToReview, boListToApprove, stage));
			}
		});
		grid.add(previousButton, 0, 21);
		
		Button nextButton = new Button();
		nextButton.setText("Next Request");
		nextButton.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 18));
		nextButton.setStyle("-fx-background-color: #00bdd6");
		nextButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				boListToReview.addLast(boListToReview.pop());
				ReviewObject re = new ReviewObject();
				stage.setScene(re.getScene(boListToReview, boListToApprove, stage));
			}
		});
		grid.add(nextButton, 1, 21);
		
		return scene;
	}

}
