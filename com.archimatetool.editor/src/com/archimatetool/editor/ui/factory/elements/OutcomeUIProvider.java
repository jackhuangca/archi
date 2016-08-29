/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.elements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.elements.OutcomeEditPart;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.IArchimateImages;
import com.archimatetool.model.IArchimatePackage;



/**
 * Outcome UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class OutcomeUIProvider extends AbstractArchimateElementUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getOutcome();
    }
    
    @Override
    public EditPart createEditPart() {
        return new OutcomeEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.OutcomeUIProvider_0;
    }

    @Override
    public Image getImage() {
        return getImageWithUserFillColor(IArchimateImages.ICON_OUTCOME_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return getImageDescriptorWithUserFillColor(IArchimateImages.ICON_OUTCOME_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(204, 204, 255);
    }
}
